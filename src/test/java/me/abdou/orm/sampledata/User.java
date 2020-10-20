package me.abdou.orm.sampledata;

import me.abdou.orm.annotations.ColumnInfo;
import me.abdou.orm.annotations.EntityInfo;
import me.abdou.orm.annotations.PrimaryKey;

import java.time.LocalDateTime;

@EntityInfo(name = "users")
public class User {
  @PrimaryKey(autoIncremented = true)
  private int id;
  private String name;
  @ColumnInfo(name = "created_at")
  private LocalDateTime createAt;
  @ColumnInfo(name = "updated_at", nullable = true)
  private LocalDateTime updateAt;

  public int getId() {
    return id;
  }

  public User setId(int id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public User setName(String name) {
    this.name = name;
    return this;
  }

  public LocalDateTime getCreateAt() {
    return createAt;
  }

  public User setCreateAt(LocalDateTime createAt) {
    this.createAt = createAt;
    return this;
  }

  public LocalDateTime getUpdateAt() {
    return updateAt;
  }

  public User setUpdateAt(LocalDateTime updateAt) {
    this.updateAt = updateAt;
    return this;
  }
}
