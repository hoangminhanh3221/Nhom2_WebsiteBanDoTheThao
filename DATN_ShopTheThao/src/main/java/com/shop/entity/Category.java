package com.shop.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CATEGORY")
public class Category implements Serializable{
	
	@Id
	@Column(name = "CategoryId", columnDefinition = "varchar(10)")
	private String categoryId;
	
	@Column(name = "CategoryName", columnDefinition = "nvarchar(50)", nullable = false)
	private String categoryName;
	
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	private List<Subcategory> subcategories;
	
}
