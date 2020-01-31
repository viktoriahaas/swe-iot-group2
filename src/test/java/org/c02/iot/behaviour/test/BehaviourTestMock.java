package org.c02.iot.behaviour.test;

import java.awt.Color;

import org.c02.swe.iot.IButton;
import org.c02.swe.iot.IButton.ButtonDirection;
import org.c02.swe.iot.behaviour.CountAndShowLed;
import org.junit.Test;
import org.mockito.Mockito;

public class BehaviourTestMock {

	@Test
	public void testBehaviour() {

		//Setup
		IButton buttonInstance = Mockito.mock(IButton.class);
		Mockito.when(buttonInstance.getButtonClickCounter(ButtonDirection.North)).thenReturn(5);

		//execute
		CountAndShowLed beh = new CountAndShowLed(buttonInstance);
		beh.run();

		//verify
		Mockito.verify(buttonInstance).getButtonClickCounter(ButtonDirection.North);
		Mockito.verify(buttonInstance).setLed(5, Color.green);
	}
}
