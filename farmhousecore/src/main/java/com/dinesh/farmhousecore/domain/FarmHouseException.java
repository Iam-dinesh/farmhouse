package com.dinesh.farmhousecore.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class FarmHouseException extends RuntimeException {

	private static final long serialVersionUID = -6034190910257806576L;

	@Getter
	@Setter
	private String errorCode;

}
