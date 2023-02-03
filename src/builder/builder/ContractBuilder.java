package builder.builder;

public abstract class ContractBuilder
{
    Contract contract;

    public abstract void buildPurchaseOrder(String clientName);

    public abstract void buildRegistrationRequest(String applicantName);

    public Contract result()
    {
        return contract;
    }
}
