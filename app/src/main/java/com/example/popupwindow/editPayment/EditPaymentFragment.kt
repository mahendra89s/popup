package com.example.popupwindow.editPayment

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.popupwindow.R

class EditPaymentFragment : DialogFragment() {
    var addCardDetailsList = mutableListOf<PaymentDetailModel>(PaymentDetailModel("Add New Payment Method","",""))
    private lateinit var adapter: AddNewPaymentDetailsAdapter
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addCardDetailsList.add(PaymentDetailModel("VISA Debit (1234)","Alan Surname","Exp : 11/24"))
        adapter = AddNewPaymentDetailsAdapter(addCardDetailsList.asReversed())
        Log.d("OnCreate","OnCreate")
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.edit_payment_dialog_layout,container,false)
        recyclerView = view.findViewById(R.id.rvCardDetails)
        recyclerView.layoutManager = GridLayoutManager(requireContext(),2,LinearLayoutManager.VERTICAL,false)
        recyclerView.adapter = adapter
        return view
    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        dialog?.window?.setGravity(
            Gravity.CENTER
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)







    }


}