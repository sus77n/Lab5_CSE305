public interface Contract {
    Contract BuildContractID(int ContractID);
    Contract BuildProperyID(int PropertyID);
    Contract BuildTenantID(int TenentID);
    Contract BuildRentAmount(float RentAmount);
    Contract SignContract();
}