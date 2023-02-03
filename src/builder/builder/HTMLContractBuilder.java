package builder.builder;

public class HTMLContractBuilder extends ContractBuilder
{
    public HTMLContractBuilder()
    {
        contract = new HTMLContract();
    }

    @Override
    public void buildPurchaseOrder(String clientName)
    {
        contract.addDocument("Purchase order client : " + clientName);
    }

    @Override
    public void buildRegistrationRequest(String applicantName)
    {
        contract.addDocument("Registration request applicant : " + applicantName);
    }
}
