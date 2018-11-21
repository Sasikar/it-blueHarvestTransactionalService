package com.blueharvest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blueharvest.dto.Transaction;
import com.blueharvest.service.TransactionalServiceDao;

@RestController
@RequestMapping("/current")

public class TransactionalController {

	@Autowired
	TransactionalServiceDao transactionalServiceDao;

	@RequestMapping(value = "/transaction/{customerId}/{initialcredit}", method = RequestMethod.GET)
	public Transaction saveTransaction(@PathVariable long customerId, @PathVariable long initialcredit) {
		Transaction t = new Transaction();
		t.setCustID(customerId);
		// creating unique current account ID
		if (initialcredit > 0) {
			t.setTransactionID((Double.valueOf(Math.random() * 10000000).longValue()));
		}
		t.setInitialCredit(initialcredit);
		return transactionalServiceDao.save(t);

	}

	@RequestMapping(value = "/details/{customerId}", method = RequestMethod.GET)
	public List<Transaction> getCustomerTransactionDetails(@PathVariable long customerId) {

		List<Transaction> listTransaction = transactionalServiceDao.findBycustIDLike(customerId);
		return listTransaction;
	}
}
