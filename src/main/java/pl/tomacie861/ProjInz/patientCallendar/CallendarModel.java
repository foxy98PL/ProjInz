package pl.tomacie861.ProjInz.patientCallendar;

import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "projinz.patientcallendar")
public class CallendarModel {

	@Id
    private Long pesel;
	@Column(name="docid")
    private Long docId;
	@Column(name="datefrom")
    private OffsetDateTime dateFrom;
	@Column(name="dateto")
    private  OffsetDateTime dateTo;

    public Long getPesel() {
        return pesel;
    }

    public void setPesel(Long pesel) {
        this.pesel = pesel;
    }

    public Long getDocId() {
        return docId;
    }

    public void setDocId(Long docId) {
        this.docId = docId;
    }

    public OffsetDateTime getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(OffsetDateTime dateFrom) {
        this.dateFrom = dateFrom;
    }

    public OffsetDateTime getDateTo() {
        return dateTo;
    }

    public void setDateTo(OffsetDateTime dateTo) {
        this.dateTo = dateTo;
    }

    public CallendarModel(Long pesel, Long docId, OffsetDateTime dateFrom, OffsetDateTime dateTo) {
        this.pesel = pesel;
        this.docId = docId;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }
    public CallendarModel(){

    }

    @Override
    public String toString() {
        return "PatientCallendar{" +
                "pesel=" + pesel +
                ", docId=" + docId +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                '}';
    }

}
