package ool.com.ofpm.json.ofpatch;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import ool.com.ofpm.json.common.BaseResponse;
import ool.com.ofpm.json.ofc.PatchLink;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class GraphDBPatchLinkJsonRes extends BaseResponse {
	private List<PatchLink> result = new ArrayList<PatchLink>();

	public List<PatchLink> getResult() {
		return result;
	}

	public void setResult(
			List<PatchLink> result) {
		this.result = result;
	}

	public static GraphDBPatchLinkJsonRes fromJson(String json) {
		Gson gson = new Gson();
		Type type = new TypeToken<GraphDBPatchLinkJsonRes>(){}.getType();
		return gson.fromJson(json, type);
	}
	@Override
	public String toJson() {
		Gson gson = new Gson();
		Type type = new TypeToken<GraphDBPatchLinkJsonRes>(){}.getType();
		return gson.toJson(this, type);
	}
	@Override
	public String toString() {
		return this.toJson();
	}
}
