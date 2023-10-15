package kr.co.wanted.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "member")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Member {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(columnDefinition = "INT(11)")
	private long memberId;
	
	private String id;
	
	private String password;
	
	public Member(long memberId) {
		this.memberId = memberId;
	}
}