package frame.ssm.demo.model; 
import frame.ssm.demo.common.base.BaseModel;
 
 /** 
 *用户信息表 
 **/ 
public class TDUser extends BaseModel{  
 
      /**数据主键--用户账号**/  
      private  String account;  
 
      /**真实姓名**/  
      private  String name;  
 
      /**用户昵称**/  
      private  String nikeName;  
 
      /**身份证号码**/  
      private  String idNum;  
 
      /**密码**/  
      private  String password;  
 
      /**性别**/  
      private  Boolean sex;  
 
      /**年龄**/  
      private  Integer age;  
 
      /**电话号码**/  
      private  String phone;  
 
      /**邮箱地址**/  
      private  String email;  
 
      /**国籍**/  
      private  String nation;  
 
      /**省**/  
      private  String province;  
 
      /**市**/  
      private  String city;  
 
      /**区（县）**/  
      private  String area;  
 
      /**具体地址**/  
      private  String specificAddress;  
 
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
      public String getAccount() { 
         return account; 
      }

      public void setAccount(String account) { 
         this.account=account; 
      }

      public String getName() { 
         return name; 
      }

      public void setName(String name) { 
         this.name=name; 
      }

      public String getNikeName() { 
         return nikeName; 
      }

      public void setNikeName(String nikeName) { 
         this.nikeName=nikeName; 
      }

      public String getIdNum() { 
         return idNum; 
      }

      public void setIdNum(String idNum) { 
         this.idNum=idNum; 
      }

      public String getPassword() { 
         return password; 
      }

      public void setPassword(String password) { 
         this.password=password; 
      }

      public Boolean getSex() { 
         return sex; 
      }

      public void setSex(Boolean sex) { 
         this.sex=sex; 
      }

      public Integer getAge() { 
         return age; 
      }

      public void setAge(Integer age) { 
         this.age=age; 
      }

      public String getPhone() { 
         return phone; 
      }

      public void setPhone(String phone) { 
         this.phone=phone; 
      }

      public String getEmail() { 
         return email; 
      }

      public void setEmail(String email) { 
         this.email=email; 
      }

      public String getNation() { 
         return nation; 
      }

      public void setNation(String nation) { 
         this.nation=nation; 
      }

      public String getProvince() { 
         return province; 
      }

      public void setProvince(String province) { 
         this.province=province; 
      }

      public String getCity() { 
         return city; 
      }

      public void setCity(String city) { 
         this.city=city; 
      }

      public String getArea() { 
         return area; 
      }

      public void setArea(String area) { 
         this.area=area; 
      }

      public String getSpecificAddress() { 
         return specificAddress; 
      }

      public void setSpecificAddress(String specificAddress) { 
         this.specificAddress=specificAddress; 
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