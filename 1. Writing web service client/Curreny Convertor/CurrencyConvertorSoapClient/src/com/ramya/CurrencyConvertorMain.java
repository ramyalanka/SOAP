package com.ramya;

import net.webservicex.Currency;
import net.webservicex.CurrencyConvertor;
import net.webservicex.CurrencyConvertorSoap;

public class CurrencyConvertorMain {
	public static void main(String[] args) {
		CurrencyConvertor currencyConvertor = new CurrencyConvertor();
		CurrencyConvertorSoap currencyConvertorSoap = currencyConvertor.getCurrencyConvertorSoap();
		double rate = currencyConvertorSoap.conversionRate(Currency.USD, Currency.INR);
		System.out.println("1 USD = " + rate + " INR");
	}
}
