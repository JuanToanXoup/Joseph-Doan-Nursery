package com.example.josephdoannursery.ui.invoice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.josephdoannursery.R
import com.example.josephdoannursery.databinding.FragmentInvoiceBinding

class InvoiceFragment : Fragment() {

    private lateinit var invoiceViewModel: InvoiceViewModel
    private var _binding: FragmentInvoiceBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        invoiceViewModel =
            ViewModelProvider(this).get(InvoiceViewModel::class.java)

        _binding = FragmentInvoiceBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.customerName
        invoiceViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}