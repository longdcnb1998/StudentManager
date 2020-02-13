package com.example.studentmanager.view.fragment;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.studentmanager.R;
import com.example.studentmanager.databinding.ContactFragmentBinding;
import com.example.studentmanager.view.adapter.ContactViewPagerAdapter;
import com.example.studentmanager.viewmodel.ContactViewModel;
import com.google.android.material.tabs.TabLayout;

public class ContactFragment extends Fragment {

    private ContactViewModel mViewModel;
    private ContactFragmentBinding binding;
    private ContactViewPagerAdapter viewPagerAdapter;

    public static ContactFragment newInstance() {
        return new ContactFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.contact_fragment,container,false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(ContactViewModel.class);
        // TODO: Use the ViewModel

        viewPagerAdapter = new ContactViewPagerAdapter(getChildFragmentManager(), PagerAdapter.POSITION_NONE);
        binding.viewPagerContact.setAdapter(viewPagerAdapter);
        binding.tabLayout.setupWithViewPager(binding.viewPagerContact);
        binding.viewPagerContact.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tabLayout));
        binding.viewPagerContact.setOffscreenPageLimit(3);
        binding.tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(binding.viewPagerContact));
    }

}
