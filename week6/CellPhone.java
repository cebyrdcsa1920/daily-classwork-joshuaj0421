public class CellPhone
{
    private String operatingSystem;
    private boolean isBroken;
    private int storageGB;
    private String phoneBrand;

    public CellPhone()
    {
        operatingSystem = "iOS";
        isBroken = false;
        storageGB = 64;
        phoneBrand = "Apple";
    }

    public CellPhone(String operatingSystem, boolean isBroken, int storageGB, String phoneBrand)
    {
        this.operatingSystem = operatingSystem;
        this.isBroken = isBroken;
        this.storageGB = storageGB;
        this.phoneBrand = phoneBrand;
    }

    public void addStorage(int additionalStorage)
    {
        storageGB += additionalStorage;
    }

    public int getStorage()
    {
        return storageGB;
    }


}
