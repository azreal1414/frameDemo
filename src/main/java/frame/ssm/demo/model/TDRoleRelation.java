package frame.ssm.demo.model; 
import frame.ssm.demo.common.base.BaseModel;
 
 /** 
 *用户权限关系表 
 **/ 
public class TDRoleRelation extends BaseModel{  
 
      /**关系ID**/  
      private  String relationUuid;  
 
      /**用户账号**/  
      private  String userAccount;  
 
      /**权限ID**/  
      private  String roleUuid;  
 
      /**父级ID**/  
      private  String parentUuid;  
 
      /**创建人**/  
      private  String createUser;  
 
      /**创建时间**/  
      private  String createTime;  
 
      /**最后修改人**/  
      private  String updateUser;  
 
      /**最后修改时间**/  
      private  String updateTime;  
 
      /**是否删除（0：删除，1：未删除）**/  
      private  Integer delFlag;  
 
      /**使用状态（10：未启用，11：启用，12：锁定）**/  
      private  Integer enable;  
 
      /**getters  and setters ***/
      public String getRelationUuid() { 
         return relationUuid; 
      }

      public void setRelationUuid(String relationUuid) { 
         this.relationUuid=relationUuid; 
      }

      public String getUserAccount() { 
         return userAccount; 
      }

      public void setUserAccount(String userAccount) { 
         this.userAccount=userAccount; 
      }

      public String getRoleUuid() { 
         return roleUuid; 
      }

      public void setRoleUuid(String roleUuid) { 
         this.roleUuid=roleUuid; 
      }

      public String getParentUuid() { 
         return parentUuid; 
      }

      public void setParentUuid(String parentUuid) { 
         this.parentUuid=parentUuid; 
      }

      public String getCreateUser() { 
         return createUser; 
      }

      public void setCreateUser(String createUser) { 
         this.createUser=createUser; 
      }

      public String getCreateTime() { 
         return createTime; 
      }

      public void setCreateTime(String createTime) { 
         this.createTime=createTime; 
      }

      public String getUpdateUser() { 
         return updateUser; 
      }

      public void setUpdateUser(String updateUser) { 
         this.updateUser=updateUser; 
      }

      public String getUpdateTime() { 
         return updateTime; 
      }

      public void setUpdateTime(String updateTime) { 
         this.updateTime=updateTime; 
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