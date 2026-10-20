package com.example.tenantmanagementsystemgroupa.databinding;
import com.example.tenantmanagementsystemgroupa.R;
import com.example.tenantmanagementsystemgroupa.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentViewTenantsBindingImpl extends FragmentViewTenantsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.newTenantLabel, 2);
        sViewsWithIds.put(R.id.callButton, 3);
        sViewsWithIds.put(R.id.newTenantGroup, 4);
        sViewsWithIds.put(R.id.allTenantsLabel, 5);
        sViewsWithIds.put(R.id.allTenantsTextView, 6);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentViewTenantsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentViewTenantsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.Button) bindings[3]
            , (androidx.constraintlayout.widget.Group) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.newTenantTextView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.tenant == variableId) {
            setTenant((com.example.tenantmanagementsystemgroupa.Tenant) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTenant(@Nullable com.example.tenantmanagementsystemgroupa.Tenant Tenant) {
        this.mTenant = Tenant;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.tenant);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String tenantSummary = null;
        com.example.tenantmanagementsystemgroupa.Tenant tenant = mTenant;

        if ((dirtyFlags & 0x3L) != 0) {



                if (tenant != null) {
                    // read tenant.summary()
                    tenantSummary = tenant.summary();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.newTenantTextView, tenantSummary);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tenant
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}