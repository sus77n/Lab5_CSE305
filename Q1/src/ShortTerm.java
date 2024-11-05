public class ShortTerm implements Contract{
    private int ContractID;
    private int PropertyID;
    private int TenentID;
    private float RentAmount;

    public ShortTerm(int contractID, int propertyID, int tenentID, float rentAmount) {
        ContractID = contractID;
        PropertyID = propertyID;
        TenentID = tenentID;
        RentAmount = rentAmount;
    }

    public Contract BuildContractID(int ContractID){
        this.ContractID = ContractID;
        return this;
    }

    public Contract BuildProperyID(int PropertyID){
        this.PropertyID = PropertyID;
        return this;
    }

    public Contract BuildTenantID(int TenentID){
        this.TenentID= TenentID;
        return this;
    }

    public Contract BuildRentAmount(float RentAmount){
        this.RentAmount = RentAmount;
        return this;
    }

    public Contract SignContract(){
        return this;
    }
}
