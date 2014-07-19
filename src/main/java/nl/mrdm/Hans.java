package nl.mrdm;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hans", schema = "")
public class Hans {
    private String f1;

    @Id
    @Column(name = "f1")
    public String getF1() {
        return f1;
    }

    public void setF1(String f1) {
        this.f1 = f1;
    }
}
