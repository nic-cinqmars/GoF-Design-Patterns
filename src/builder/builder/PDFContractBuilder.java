package builder.builder;

public class PDFContractBuilder extends ContractBuilder
{
    public PDFContractBuilder()
    {
        contract = new PDFContract();
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
