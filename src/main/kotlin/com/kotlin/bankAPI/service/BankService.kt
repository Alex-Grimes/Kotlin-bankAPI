package com.kotlin.bankAPI.service

import com.kotlin.bankAPI.datasource.BankDataSource
import org.springframework.stereotype.Service
import com.kotlin.bankAPI.model.Bank

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> {
        return emptyList()
    }
}