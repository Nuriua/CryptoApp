package com.example.cryptoapp.presentation

import androidx.recyclerview.widget.DiffUtil
import com.example.cryptoapp.data.network.model.CoinInfoDto

class CoinInfoDiffCallback: DiffUtil.ItemCallback<CoinInfoDto>() {
    override fun areItemsTheSame(oldItem: CoinInfoDto, newItem: CoinInfoDto): Boolean {
        TODO("Not yet implemented")
    }

    override fun areContentsTheSame(oldItem: CoinInfoDto, newItem: CoinInfoDto): Boolean {
        TODO("Not yet implemented")
    }
}