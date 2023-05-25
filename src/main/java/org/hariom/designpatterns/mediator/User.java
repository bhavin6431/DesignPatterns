package org.hariom.designpatterns.mediator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class User {
	private String name;

	public void sendMessage(String name) {
		ChatRoom.showMessage(this, name);
	}
}
