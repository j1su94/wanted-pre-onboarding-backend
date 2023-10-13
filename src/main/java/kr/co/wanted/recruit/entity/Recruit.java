package kr.co.wanted.recruit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import kr.co.wanted.company.entity.Company;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "recruit")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Recruit {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(columnDefinition = "INT(11)")
	private long recruitId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "company_id")
	private Company company;
	
	private String position;
	
	private int reward;
	
	private String detail;
	
	private String technologies;
	
	public void update(String position, int reward, String detail, String technologies) {
		this.position = position;
		this.reward = reward;
		this.detail = detail;
		this.technologies = technologies;
	}
	
}