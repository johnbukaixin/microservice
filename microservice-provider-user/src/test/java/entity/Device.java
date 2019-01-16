package entity;

/**
 * create by ${user} on ${date}
 */
public class Device {
    private String id;
    private String name;
    private String mac;
    private String type;
    private String code;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Device(String id, String name, String mac, String type, String code) {
        this.id = id;
        this.name = name;
        this.mac = mac;
        this.type = type;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", mac='" + mac + '\'' +
                ", type='" + type + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
