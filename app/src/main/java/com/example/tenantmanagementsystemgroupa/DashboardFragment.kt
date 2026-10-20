package com.example.tenantmanagementsystemgroupa

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.tenantmanagementsystemgroupa.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {
    private var _binding: FragmentDashboardBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.addTenantButton.setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment_to_addTenantFragment)
        }
        binding.viewTenantsButton.setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment_to_viewTenantsFragment)
        }
        refreshSummary()
    }

    override fun onResume() {
        super.onResume()
        if (_binding != null) refreshSummary()
    }

    private fun refreshSummary() {
        binding.tenantCountTextView.text = "Tenants\n${TenantRepository.tenants.size}"
        binding.totalRentTextView.text = "Total rent\nKSh ${"%,.0f".format(TenantRepository.totalRent())}"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
