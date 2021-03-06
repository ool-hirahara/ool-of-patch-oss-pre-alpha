package ool.com.ofpm.json.device;

import java.lang.reflect.Type;

import ool.com.ofpm.json.common.BaseResponse;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class DeviceInfoReadJsonOut extends BaseResponse {
	private DeviceInfo result = null;

	@Override
	public String toJson() {
		Gson gson = new Gson();
		Type type = new TypeToken<DeviceInfoReadJsonOut>() {}.getType();
		return gson.toJson(this, type);
	}

	@Override
	public String toString() {
		return this.toJson();
	}

	public DeviceInfo getResult() {
		return result;
	}

	public void setResult(DeviceInfo result) {
		this.result = result;
	}
}
