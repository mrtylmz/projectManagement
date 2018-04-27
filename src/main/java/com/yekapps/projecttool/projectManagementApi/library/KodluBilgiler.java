package com.yekapps.projecttool.projectManagementApi.library;

public class KodluBilgiler {

	public enum Roles{
		USER("ROLE_USER","User"),
		MODERATOR("ROLE_MODERATOR","Moderator"),
		ADMIN("ROLE_ADMIN","Admin");
		private String code;
		private String roleName;
		Roles(String code,String roleName){
			this.code=code;
			this.roleName=roleName;
		}
		public String getCode() {
			return code;
		}
		public String getRoleName() {
			return roleName;
		}
		
		public static String getRoleName(String code) {
			for (Roles roles : Roles.values()) {
				if (roles.getCode().equals(code))
					return roles.getRoleName();
			}

			return null;
		}
		public static Roles getByCode(String code) {
			for (Roles roles : Roles.values()) {
				if (roles.getCode().equals(code))
					return roles;
			}

			return null;
		}
		
	}
	
	public final class JobStatus{
		public static final String OPEN="OPEN";
		public static final String ASSIGNED="ASSIGNED";
		public static final String COMPLETED="COMPLETED";
		public static final String FAILED="FAILED";
		public static final String DELETED="DELETED";
	}
	
}
