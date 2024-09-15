package com.dinesh.farmhouse.helper;

import java.util.Collection;
import java.util.Map;

import lombok.experimental.UtilityClass;

@UtilityClass
public class UtilValidate {

	public boolean isEmpty(Object obj) {
		if (obj == null) {
			return true;
		}
		if (obj instanceof String) {
			return ((String) obj).isEmpty();
		} else if (obj instanceof Collection) {
			return ((Collection<?>) obj).isEmpty();
		} else if (obj instanceof Map) {
			return ((Map<?, ?>) obj).isEmpty();
		} else if (obj.getClass().isArray()) {
			return java.lang.reflect.Array.getLength(obj) == 0;
		}

		return false;
	}

	public boolean isNotEmpty(Object object) {
		return !isEmpty(object);
	}

}
