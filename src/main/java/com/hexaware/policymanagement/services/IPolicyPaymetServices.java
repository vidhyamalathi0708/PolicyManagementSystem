package com.hexaware.policymanagement.services;

import java.util.List;

import com.hexaware.policymanagement.dto.PolicyPaymentDTO;
import com.hexaware.policymanagement.entity.PolicyPayment;

public interface IPolicyPaymetServices 
{
	public PolicyPayment createPolicyPayment(PolicyPaymentDTO policyPaymentDTO);
	public PolicyPayment updatePolicyPayment(PolicyPaymentDTO policyPaymentDTO);
	public void deletePolicyPaymentByTxnId(long txnId);
	public PolicyPayment getPolicyPaymentByTxnId(long txnId);
    public PolicyPayment getPolicyPaymentByPolicyNo(PolicyPayment PolicyNo);


	
	public List<PolicyPayment> getAllPolicyPayment();

}
