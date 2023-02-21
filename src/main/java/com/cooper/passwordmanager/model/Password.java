package com.cooper.passwordmanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import com.cooper.passwordmanager.model.User;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "passwords")
@NoArgsConstructor
public class Password {


	@SequenceGenerator(
			name = "passwords_sequence",
			sequenceName = "passwords_sequence",
			allocationSize = 1
	)
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "passwords_sequence"
	)
	private Integer id;

	@Column(name = "website")
	@NotNull(message = "Website cannot be empty")
	private String website;
	@Column(name = "username")
	@NotNull(message = "Username cannot be empty")
	private String username;
	@NotNull(message = "Password cannot be empty")
	@Column(name = "password")
	private String password;

	public Password(String website, String username, String password) {
		this.website = website;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Password{" +
				"website='" + website + '\'' +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				'}';
	}

}
