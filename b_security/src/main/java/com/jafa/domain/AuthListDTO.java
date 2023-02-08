package com.jafa.domain;

import java.util.List;

import lombok.Setter;
import lombok.ToString;
import lombok.Getter;

@Getter
@Setter
@ToString
public class AuthListDTO {
	private List<AuthVO> authList;

}
