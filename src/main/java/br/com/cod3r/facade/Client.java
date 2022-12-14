package br.com.cod3r.facade;

import br.com.cod3r.facade.facade.CallCenterFacade;

import br.com.cod3r.facade.model.Card;

public class Client {

	public static void main(String[] args) {
		final CallCenterFacade facade = new CallCenterFacade();

		Card card = facade.getCardByUser(123456L);
		System.out.println(card);

		facade.getSumary(card);
		facade.getPaymentInfoByCard(card);

		final Card newCard = facade.getCardByUser(123456L);
		System.out.println(newCard);
	}
}
