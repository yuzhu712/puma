package com.dianping.puma.core.sync.model.mapping;

import java.util.ArrayList;
import java.util.List;

public class DatabaseMapping implements Cloneable {

    private String from;
    private String to;

    private List<TableMapping> tables = new ArrayList<TableMapping>();

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public List<TableMapping> getTables() {
        return tables;
    }

    public void setTables(List<TableMapping> tables) {
        this.tables = tables;
    }

    public void addTable(TableMapping table) {
        this.tables.add(table);
    }

    @Override
    public String toString() {
        return "Database [from=" + from + ", to=" + to + ", tables=" + tables + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((from == null) ? 0 : from.hashCode());
        result = prime * result + ((tables == null) ? 0 : tables.hashCode());
        result = prime * result + ((to == null) ? 0 : to.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof DatabaseMapping))
            return false;
        DatabaseMapping other = (DatabaseMapping) obj;
        if (from == null) {
            if (other.from != null)
                return false;
        } else if (!from.equals(other.from))
            return false;
        if (tables == null) {
            if (other.tables != null)
                return false;
        } else if (!tables.equals(other.tables))
            return false;
        if (to == null) {
            if (other.to != null)
                return false;
        } else if (!to.equals(other.to))
            return false;
        return true;
    }

    @Override
    protected DatabaseMapping clone() throws CloneNotSupportedException {
        DatabaseMapping dm = new DatabaseMapping();
        dm.setFrom(this.getFrom());
        dm.setTo(this.getTo());
        List<TableMapping> tables0 = new ArrayList<TableMapping>();
        if (this.getTables() != null) {
            for (TableMapping c : this.getTables()) {
                tables0.add(c.clone());
            }
        }
        dm.setTables(tables0);
        return dm;
    }

}
