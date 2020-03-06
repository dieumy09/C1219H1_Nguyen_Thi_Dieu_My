package Models;

public class Booking {
    private String idCustomer;
    private String customerName;
    private String idService;
    private String serviceName;

    public Booking() {
    }

    public Booking(String idCustomer, String customerName, String idService, String serviceName) {
        this.idCustomer = idCustomer;
        this.customerName = customerName;
        this.idService = idService;
        this.serviceName = serviceName;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
