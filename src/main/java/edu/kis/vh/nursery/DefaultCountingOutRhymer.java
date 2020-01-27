package edu.kis.vh.nursery;

/**
 * Tworzy liste liczb calkowitych
 */
public class DefaultCountingOutRhymer {

    public int MAX_AMOUNT_OF_ELEMENTS = 12;
    final public int[] numbers = new int[MAX_AMOUNT_OF_ELEMENTS];

    private int EMPTY = -1;
    private int IF_EMPTY = -1;

    /**
     * dodaje element do obiektu tej klasy
     * @param in element dodawany
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[setTotal(getTotal() + 1)] = in;
    }

    /**
     * sprawdza, czy lista jest pusta
     * @return czy nie dodano elementu
     */
    public boolean callCheck() {
        return getTotal() == EMPTY;
    }

    /**
     * Sprawdza, czy lista jest pelna
     * @return pojemnosc listy
     */
    public boolean isFull() {
        return getTotal() == MAX_AMOUNT_OF_ELEMENTS - 1;
    }

    /**
     * Oddaje ostatni element w liscie
     * @return -1 jesli lista jest pusta, w innym przypadku oddaje wartosc elementu ostatniego
     */
    protected int peekaboo() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[getTotal()];
    }

    /**
     * Zdejmuje element z listy i oddaje wartosc
     * @return wartosc zdjeta z listy
     */
    public int countOut() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[setTotal(getTotal() - 1)];
    }

    /**
     * indeks ostatniego elementu wpisanego do listy, domyslna wartosc indeksu dla pustej listy wynosi -1
     */
    public int getTotal() {
        return EMPTY;
    }

    public int setTotal(int total) {
        this.EMPTY = total;
        return this.EMPTY;
    }
}
