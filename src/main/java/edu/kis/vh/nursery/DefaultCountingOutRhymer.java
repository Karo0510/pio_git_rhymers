package edu.kis.vh.nursery;

/**
 * Tworzy liste liczb calkowitych
 */
public class DefaultCountingOutRhymer {

    private int[] NUMBERS = new int[12];

    /**
     * indeks ostatniego elementu wpisanego do listy, domyslna wartosc indeksu dla pustej listy wynosi -1
     */
    public int total = -1;

    /**
     * dodaje element do obiektu tej klasy
     * @param in element dodawany
     */
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    /**
     * sprawdza, czy lista jest pusta
     * @return czy nie dodano elementu
     */
    public boolean callCheck() {
        return total == -1;
    }

    /**
     * Sprawdza, czy lista jest pelna
     * @return pojemnosc listy
     */
    public boolean isFull() {
        return total == 11;
    }

    /**
     * Oddaje ostatni element w liscie
     * @return -1 jesli lista jest pusta, w innym przypadku oddaje wartosc elementu ostatniego
     */
    protected int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    /**
     * Zdejmuje element z listy i oddaje wartosc
     * @return wartosc zdjeta z listy
     */
    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

}
