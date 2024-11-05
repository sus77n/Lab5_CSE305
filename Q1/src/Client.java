public class Client {
    public Contract requestCreateRentalContract(Contract builder, int contractID, int propertyID, int tenantID, float rentAmount){
        builder.BuildContractID(contractID);
        builder.BuildProperyID(propertyID);
        builder.BuildTenantID(tenantID);
        builder.BuildRentAmount(rentAmount);
        return builder.SignContract();
    }
}
