package javaprogramming2.week11.exam01;

import java.util.*;

public class Deal {
	public static void main(String[] args) {
		int numHands = Integer.parseInt(args[0]); //여기서 오류발생 args0가 없다 몇명이 몇장씩 가질거다라는걸 넣어줘야함
 		int cardsPerHand = Integer.parseInt(args[1]);
		// 정상적인 52장 카드 묶음을 만든다
		String[] suit = new String[] { "♤", "♡", "◇", "♧" };
		String[] rank = new String[] { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		List<String> deck = new ArrayList<String>();
		for (int i = 0; i < suit.length; i++)
			for (int j = 0; j < rank.length; j++)
				deck.add(suit[i] + rank[j]);
		// 카드 묶음을 섞는다.
		Collections.shuffle(deck); //deck arraylist를 셔플함
		if (numHands * cardsPerHand > deck.size()) {
			System.out.println("Not enough cards.");
			return;
		}
		for (int i = 0; i < numHands; i++)
			System.out.println(dealHand(deck, cardsPerHand));
	}

	public static <E> List<E> dealHand(List<E> deck, int n) { //n장씩 나눠줌
		int deckSize = deck.size();
		List<E> handView = deck.subList(deckSize - n, deckSize); //n장만큼 sublist 생성
		List<E> hand = new ArrayList<E>(handView); //hand라는 새로운 arraylist 생성
		handView.clear(); // handview에 있는거 지우면 deck에서도 지워짐
		return hand;
	}
} //argument 지정해줘야함 configurations 지정해줘야함