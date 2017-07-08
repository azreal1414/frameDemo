package frame.ssm.demo.model; 
import frame.ssm.demo.common.base.BaseModel;
 
 /** 
 *用户权限表 
 **/ 
public class TDRoles extends BaseModel{  
 
      /**权限ID**/  
      private  String role;  
 
      /**权限名称**/  
      private  String roleName;  
 
      /**权限登记**/  
      private  Integer roleLevel;  
 
      /**创建时间**/  
      private  String createTime;  
 
      /**创建人**/  
      private  String createUser;  
 
      /**修改时间**/  
      private  String updateTime;  
 
      /**修改人**/  
      private  String updateUser;  
 
      /**是否删除（0：删除，1：未删除）**/  
      private  Integer delFlag;  
 
      /**使用状态（10：未启用，11：启用，12：锁定）**/  
      private  Integer enable;  
 
      /**getters  and setters ***/
      public String getRole() { 
         return role; 
      }

      public void setRole(String role) { 
         this.role=role; 
      }

      public String getRoleName() { 
         return roleName; 
      }

      public void setRoleName(String roleName) { 
         this.roleName=roleName; 
      }

      public Integer getRoleLevel() { 
         return roleLevel; 
      }

      public void setRoleLevel(Integer roleLevel) { 
         this.roleLevel=roleLevel; 
      }

      public String getCreateTime() { 
         return createTime; 
      }

      public void setCreateTime(String createTime) { 
         this.createTime=createTime; 
      }

      public String getCreateUser() { 
         return createUser; 
      }

      public void setCreateUser(String createUser) { 
         this.createUser=createUser; 
      }

      public String getUpdateTime() { 
         return updateTime; 
      }

      public void setUpdateTime(String updateTime) { 
         this.updateTime=updateTime; 
      }

      public String getUpdateUser() { 
         return updateUser; 
      }

      public void setUpdateUser(String updateUser) { 
         this.updateUser=updateUser; 
      }

      public Integer getDelFlag() { 
         return delFlag; 
      }

      public void setDelFlag(Integer delFlag) { 
         this.delFlag=delFlag; 
      }

      public Integer getEnable() { 
         return enable; 
      }

      public void setEnable(Integer enable) { 
         this.enable=enable; 
      }

 
 }