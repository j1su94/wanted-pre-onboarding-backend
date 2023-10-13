package kr.co.wanted.company.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import kr.co.wanted.recruit.entity.Recruit;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "company")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Company {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(columnDefinition = "INT(11)")
	private long companyId;
	
	private String companyName;
	
	private String country;
	
	private String region;
	
	@OneToMany(mappedBy = "company")
	private List<Recruit> recruitList = new ArrayList<>();
	
	public Company(long companyId) {
		this.companyId = companyId;
	}
}