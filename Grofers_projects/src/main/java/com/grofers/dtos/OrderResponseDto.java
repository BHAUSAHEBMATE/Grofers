package com.grofers.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponseDto {

	private List<OrderDto> orderList;
	
	private int pageNumber;
	private int pageSize;
	private long totalElements;
	private int totalPages;
	private boolean isLastPage;
	
	
	
	
	
	public OrderResponseDto() {
		// TODO Auto-generated constructor stub
	}





	public List<OrderDto> getOrderList() {
		return orderList;
	}





	public void setOrderList(List<OrderDto> orderList) {
		this.orderList = orderList;
	}





	public int getPageNumber() {
		return pageNumber;
	}





	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}





	public int getPageSize() {
		return pageSize;
	}





	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}





	public long getTotalElements() {
		return totalElements;
	}





	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}





	public int getTotalPages() {
		return totalPages;
	}





	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}





	public boolean isLastPage() {
		return isLastPage;
	}





	public void setLastPage(boolean isLastPage) {
		this.isLastPage = isLastPage;
	}
	
	
}