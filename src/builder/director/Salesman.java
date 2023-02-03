package builder.director;

import builder.builder.Contract;
import builder.builder.ContractBuilder;

public class Salesman
{
    ContractBuilder builder;

    public Salesman(ContractBuilder builder)
    {
        this.builder = builder;
    }

    public Contract build(String clientName)
    {
        builder.buildPurchaseOrder(clientName);
        builder.buildRegistrationRequest(clientName);
        return builder.result();
    }
}
