package com.orientechnologies.orient.core.db.tool;

import junit.framework.Assert;

import org.mockito.Mockito;
import org.testng.annotations.Test;

import com.orientechnologies.orient.core.command.OCommandOutputListener;
import com.orientechnologies.orient.core.db.record.ODatabaseRecord;

public class ODatabaseImpExpAbstractTest {

	@Test
	public void setOptions_multipleIncludedClasses_returnsExpectedList() {
		
		ODatabaseImpExpAbstract obj = new ODatabaseImpExpAbstract(Mockito.mock(ODatabaseRecord.class), null, Mockito.mock(OCommandOutputListener.class)) {
		};
		
		obj.setOptions("-includeClass=Class1,Class2,Class3");
		
		Assert.assertEquals(3, obj.includeClasses.size());
		Assert.assertTrue(obj.includeClasses.contains("Class1".toUpperCase()));
		Assert.assertTrue(obj.includeClasses.contains("Class2".toUpperCase()));
		Assert.assertTrue(obj.includeClasses.contains("Class3".toUpperCase()));
	}
}
