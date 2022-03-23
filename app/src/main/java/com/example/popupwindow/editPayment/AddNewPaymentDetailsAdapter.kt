package com.example.popupwindow.editPayment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.popupwindow.R
import kotlinx.android.synthetic.main.add_new_payment_details_card.view.*

class AddNewPaymentDetailsAdapter(
    var paymentDetailsList : MutableList<PaymentDetailModel>
) : RecyclerView.Adapter<AddNewPaymentDetailsAdapter.ViewHolder>() {

    inner class ViewHolder(view : View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.add_new_payment_details_card,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if(position == paymentDetailsList.size-1){
            holder.itemView.txtAddNewPayment.let{
                it.visibility = View.VISIBLE
                it.text = paymentDetailsList[position].cardDetail

            }
            holder.itemView.btnDelete.visibility = View.GONE
        }
        else{
            holder.itemView.txtCardDetail.text = paymentDetailsList[position].cardDetail
            holder.itemView.txtProfieInfo.text = paymentDetailsList[position].cardUserName
            holder.itemView.txtCardExpiry.text = paymentDetailsList[position].cardExpiry
        }
    }

    override fun getItemCount(): Int {
        return paymentDetailsList.size
    }

}