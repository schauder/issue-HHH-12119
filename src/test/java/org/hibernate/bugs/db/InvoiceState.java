package org.hibernate.bugs.db;

/**
 * Enum holding the current InvoiceState structure.
 *
 * @author tlang
 */

public enum InvoiceState {
    Open("Offen"),
    Invoiced("Fakturiert"),
    Cancelled("Storniert"),
    Closed("Abgeschlossen");

    private final String label;
    private final String value;

    /**
     * package-private standard constructor.
     * building up the dto
     *
     * @param label a given label
     */
    InvoiceState(String label) {
        this.label = label;
        this.value = this.name();
    }

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return value;
    }

    /**
     * to string representation of the current instance.
     *
     * @return String
     */
    @Override
    public String toString() {
        return this.getLabel();
    }
}
