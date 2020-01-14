package edu.kis.vh.nursery;

/**
 * Tworzy liste liczb calkowitych
 */
public class DefaultCountingOutRhymer {

    public int[] NUMBERS = new int[12];

    private int total = -1;

    /**
     * dodaje element do obiektu tej klasy
     * @param in element dodawany
     */
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[setTotal(getTotal() + 1)] = in;
    }

    /**
     * sprawdza, czy lista jest pusta
     * @return czy nie dodano elementu
     */
    public boolean callCheck() {
        return getTotal() == -1;
    }

    /**
     * Sprawdza, czy lista jest pelna
     * @return pojemnosc listy
     */
    public boolean isFull() {
        return getTotal() == 11;
    }

    /**
     * Oddaje ostatni element w liscie
     * @return -1 jesli lista jest pusta, w innym przypadku oddaje wartosc elementu ostatniego
     */
    protected int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[getTotal()];
    }

    /**
     * Zdejmuje element z listy i oddaje wartosc
     * @return wartosc zdjeta z listy
     */
    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[setTotal(getTotal() - 1)];
    }

    /**
     * indeks ostatniego elementu wpisanego do listy, domyslna wartosc indeksu dla pustej listy wynosi -1
     */
    public int getTotal() {
        return total;
    }

    public int setTotal(int total) {
        this.total = total;
        return total;
    }
}
