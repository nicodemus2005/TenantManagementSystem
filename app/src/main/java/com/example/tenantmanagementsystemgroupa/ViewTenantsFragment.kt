package com.example.tenantmanagementsystemgroupa

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.tenantmanagementsystemgroupa.databinding.FragmentViewTenantsBinding

class ViewTenantsFragment : Fragment() {
    private var _binding: FragmentViewTenantsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentViewTenantsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val tenant = if (android.os.Build.VERSION.SDK_INT >= 33) {
            arguments?.getSerializable("newTenant", Tenant::class.java)
        } else {
            @Suppress("DEPRECATION")
            arguments?.getSerializable("newTenant") as? Tenant
        }

        if (tenant == null) {
            binding.newTenantGroup.visibility = View.GONE
        } else {
            binding.tenant = tenant
            binding.newTenantGroup.visibility = View.VISIBLE
            binding.callButton.setOnClickListener {
                val phone = tenant.phone.trim()
                if (phone.isNotEmpty()) {
                    startActivity(Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phone")))
                } else {
                    Toast.makeText(requireContext(), "No phone number available", Toast.LENGTH_SHORT).show()
                }
            }
        }

        val tenants = TenantRepository.tenants
        binding.allTenantsTextView.text = if (tenants.isEmpty()) {
            "No tenants yet. Use Add Tenant to create the first record."
        } else {
            tenants.joinToString("\n\n--------------------\n\n") { it.summary() }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
