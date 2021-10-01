package Domain;

public class WallSearch {
    private int OwenerId;
    private String Domain;
    private String Query;
    private int OwnersOnly;
    private int Count;
    private int Offset;
    private int Extended;
    private String Fields;

    public void setOwenerId(int owenerId) {
        OwenerId = owenerId;
    }

    public void setDomain(String domain) {
        Domain = domain;
    }

    public void setQuery(String query) {
        Query = query;
    }

    public void setOwnersOnly(int ownersOnly) {
        OwnersOnly = ownersOnly;
    }

    public void setCount(int count) {
        Count = count;
    }

    public void setOffset(int offset) {
        Offset = offset;
    }

    public void setExtended(int extended) {
        Extended = extended;
    }

    public void setFields(String fields) {
        Fields = fields;
    }

    public int getOwenerId() {
        return OwenerId;
    }

    public String getDomain() {
        return Domain;
    }

    public String getQuery() {
        return Query;
    }

    public int getOwnersOnly() {
        return OwnersOnly;
    }

    public int getCount() {
        return Count;
    }

    public int getOffset() {
        return Offset;
    }

    public int getExtended() {
        return Extended;
    }

    public String getFields() {
        return Fields;
    }
}
