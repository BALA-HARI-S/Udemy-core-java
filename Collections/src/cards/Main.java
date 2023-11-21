package cards;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        Empty array of 13 cards
        Card[] cardArray = new Card[13];
        Card aceOfHearts = Card.getFaceCard(Card.Suit.HEART, 'A');
        Arrays.fill(cardArray, aceOfHearts);

//        Passing Arrays as List
        Card.printDeck(Arrays.asList(cardArray), "Aces of Hearts", 1);
        System.out.println("Deck size : " + Arrays.asList(cardArray).size());

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards, aceOfHearts); //NEW
        System.out.println(cards);
        System.out.println("cards.size() : " + cards.size());
//        Collection.fill doesn't fill the List(cards) with values or null values
//        it only populates List when it's cards.size() is > 0 by replacing values
//        to fill use this method Collections.nCopies(int, value)

        List<Card> acesOfHearts = Collections.nCopies(13, aceOfHearts); //NEW
        Card.printDeck(acesOfHearts, "AcesOfHearts" , 1);

        Card kingOfClubs = Card.getFaceCard(Card.Suit.CLUB, 'K');
        List<Card> kingsOfClubs = Collections.nCopies(13, kingOfClubs);
        Card.printDeck(kingsOfClubs, "Kings of Clubs", 1);

        Collections.addAll(cards, cardArray);
        Collections.addAll(cards, cardArray);
        Card.printDeck(cards, "Aces of Hearts in cards List", 2);

//        Here cards (source destination) should > || == kingsOfClubs (current list), otherwise
//        this method throws a runtime exception
//        IndexOutOfBoundsException: Source does not fit in dest
//        It doesn't return any copy of list only copies elements
//        if you want copy of elements us List.copyOf() method

        Collections.copy(cards, kingsOfClubs);
        Card.printDeck(cards, "KingsOfClubs Copied in cards List", 2);

        cards = List.copyOf(kingsOfClubs);
        Card.printDeck(cards, "Copied kingsOfClubs in cards", 1);

//        shuffle method

        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        Collections.shuffle(deck);
        Card.printDeck(deck, "Shuffled Deck", 4);

        Collections.reverse(deck);
        Card.printDeck(deck, "Reversed Deck", 4);

        var sortingAlgorithm = Comparator.comparing(Card::rank)
                .thenComparing(Card::suit);
        Collections.sort(deck, sortingAlgorithm);
        Card.printDeck(deck, "Deck sorted by rank, suit", 13);

        Collections.reverse(deck);
        Card.printDeck(deck, "Reversed Deck", 13);

        List<Card> kings = new ArrayList<>(deck.subList(4,8));
        Card.printDeck(kings, "Deck of kings", 1);

        List<Card> tens = new ArrayList<>(deck.subList(16,20));
        Card.printDeck(tens, "Deck of kings", 1);

        int subListIndex = Collections.indexOfSubList(deck, kings);
        System.out.println("Sublist Index of kings = " + subListIndex);
        System.out.println("Contains tens = " + deck.containsAll(tens));

        boolean disjoint = Collections.disjoint(deck, tens);
        System.out.println("disjoint = " + disjoint);

        boolean disjoint2 = Collections.disjoint(kings, tens);
        System.out.println("disjoint = " + disjoint2);

//        BinarySearch in Collections
        deck.sort(sortingAlgorithm);
        Card tenOfHearts = Card.getNumericCard(Card.Suit.HEART, 10);
        int foundIndex = Collections.binarySearch(deck, tenOfHearts, sortingAlgorithm);
        System.out.println("BinarySearch foundIndex = " + foundIndex);
        System.out.println("indexOf = " + deck.indexOf(tenOfHearts));
        System.out.println(deck.get(foundIndex));

//        replaceAll() in Collections this method returns a boolean value
        Card tenOfClubs = Card.getNumericCard(Card.Suit.CLUB, 10);
        Collections.replaceAll(deck, tenOfHearts, tenOfClubs);
        Card.printDeck(deck.subList(32,36),"Tens row : CLUB", 1);

        Collections.replaceAll(deck, tenOfClubs, tenOfHearts);
        Card.printDeck(deck.subList(32,36),"Tens row : HEART", 1);

//        Frequency method check for duplicates
        System.out.println("Ten of Hearts Cards = " +
                Collections.frequency(deck, tenOfHearts));
    }
}
