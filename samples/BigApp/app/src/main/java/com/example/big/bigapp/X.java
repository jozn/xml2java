
//DON'T EDIT, THIS FILE IS AUTO GENERATED AND ALWAYS WILL BE SYNCED WITH 'layout/*.xml' FILES
//TO SYNC JUST REBUILD THE APP
//SEE THIS TOOL AT: https://github.com/jozn/xml2java

package com.example.big.bigapp;

import android.widget.*;
import android.view.*;
import android.webkit.WebView;
import android.view.LayoutInflater;
import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TextInputLayout;
import android.support.percent.PercentRelativeLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ViewStubCompat;
import com.daimajia.swipe.SwipeLayout;
import com.dlazaro66.qrcodereaderview.QRCodeReaderView;
import com.hanks.library.AnimateCheckBox;
import com.larswerkman.holocolorpicker.ColorPicker;
import com.larswerkman.holocolorpicker.OpacityBar;
import com.larswerkman.holocolorpicker.SVBar;
import com.pchmn.materialchips.ChipsInput;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;
import com.uncopt.android.widget.text.justify.JustifiedTextView;
import com.vicmikhailau.maskededittext.MaskedEditText;
import io.fotoapparat.view.CameraView;
import it.chengdazhi.styleimageview.StyleImageView;
import life.knowledge4.videotrimmer.K4LVideoTrimmer;
import net.iGap.libs.floatingAddButton.ArcMenu;
import net.iGap.libs.rippleeffect.RippleView;
import net.iGap.libs.tabBar.NavigationTabStrip;
import net.iGap.messageprogress.MessageProgress;
import net.iGap.module.CircleImageView;
import net.iGap.module.CustomCircleImage;
import net.iGap.module.CustomTextViewMedium;
import net.iGap.module.EditTextAdjustPan;
import net.iGap.module.EmojiEditTextE;
import net.iGap.module.EmojiTextViewE;
import net.iGap.module.HeaderTextview;
import net.iGap.module.MEditText;
import net.iGap.module.MaterialDesignTextView;
import net.iGap.module.MyAppBarLayout;
import net.iGap.module.NotTouchableCoordinatorLayout;
import net.iGap.module.NumberPicker;
import net.iGap.module.PointsOverlayView;
import net.iGap.module.ReserveSpaceGifImageView;
import net.iGap.module.ReserveSpaceRoundedImageView;
import net.iGap.module.TouchImageView;
import org.osmdroid.views.MapView;
import pl.droidsonroids.gif.GifImageView;
import com.example.big.bigapp.R;

public class X {
    
    public static class ActivityChat {
        public FrameLayout root;
        public FrameLayout ac_ll_parent;
        public MyAppBarLayout ac_appBarLayout;
        public LinearLayout toolbarContainer;
        public LinearLayout toolbar;
        public RippleView chl_ripple_back_Button;
        public MaterialDesignTextView chl_imv_back_Button;
        public MaterialDesignTextView ac_txt_cloud;
        public CircleImageView chl_imv_user_picture;
        public LinearLayout lyt_user;
        public EmojiTextViewE chl_txt_name;
        public MaterialDesignTextView imgMutedRoom;
        public AppCompatImageView ac_txt_verify;
        public LinearLayout chl_txt_viewGroup_seen;
        public EmojiTextViewE chl_txt_last_seen;
        public RippleView acp_ripple_call;
        public RippleView chl_ripple_menu_button;
        public MaterialDesignTextView chl_imv_menu_button;
        public LinearLayout chl_ll_appbar_selelected;
        public RippleView chl_ripple_close_layout;
        public MaterialDesignTextView chl_btn_close_layout;
        public TextView chl_txt_number_of_selected;
        public RippleView chl_ripple_replay_selected;
        public MaterialDesignTextView chl_btn_replay_selected;
        public RippleView chl_ripple_copy_selected;
        public MaterialDesignTextView chl_btn_copy_selected;
        public RippleView chl_ripple_forward_selected;
        public MaterialDesignTextView chl_btn_forward_selected;
        public RippleView chl_ripple_delete_selected;
        public MaterialDesignTextView chl_btn_delete_selected;
        public LinearLayout ac_ll_search_message;
        public RippleView chl_ripple_back;
        public MEditText chl_edt_search_message;
        public RippleView chl_btn_close_ripple_search_message;
        public MaterialDesignTextView ac_btn_clear_message_search;
        public MaterialDesignTextView mls_btn_play_music;
        public TextView mls_txt_music_name;
        public TextView mls_txt_music_time_counter;
        public TextView mls_txt_music_time;
        public MaterialDesignTextView mls_btn_close;
        public TextView cslcs_btn_call_strip;
        public TextView cslcs_txt_timer;
        public TextView chat_txt_addContact;
        public MaterialDesignTextView chat_txt_close;
        public ImageView chl_img_view_chat;
        public RecyclerView chl_recycler_view_chat;
        public FrameLayout ac_ll_scrool_navigate;
        public MaterialDesignTextView ac_txt_down_navigation;
        public TextView cs_txt_unread_message;
        public TextView empty_messages;
        public LinearLayout ac_ll_attach_text;
        public TextView ac_txt_file_neme_for_sending;
        public MaterialDesignTextView ac_btn_cancel_sending_file;
        public LinearLayout ac_ll_hash_navigation;
        public MaterialDesignTextView ac_btn_hash_up;
        public TextView ac_txt_hash_counter;
        public MaterialDesignTextView ac_btn_hash_down;
        public MaterialDesignTextView ac_btn_hash_close;
        public ViewStubCompat replayLayoutStub;
        public ImageView cslhs_imv_forward;
        public ImageView cslhf_imv_thumbnail;
        public EmojiTextViewE cslhf_txt_forward_from;
        public EmojiTextViewE cslhf_txt_message;
        public MaterialDesignTextView cslhf_imv_cansel;
        public LinearLayout chl_ll_attach;
        public MaterialDesignTextView chl_imv_smile_button;
        public EmojiEditTextE chl_edt_chat;
        public MaterialDesignTextView chl_imv_send_button;
        public LinearLayout layoutAttachBottom;
        public MaterialDesignTextView chl_imv_attach_button;
        public MaterialDesignTextView chl_imv_mic_button;
        public LinearLayout ac_ll_join;
        public TextView ac_txt_join;
        public RelativeLayout chl_ll_channel_footer;
        public TextView chl_txt_mute_channel;
        public ImageView img_pic_record;
        public TextView txt_time_record;
        public TextView txt_time_mili_secend;
        public TextView txt_slideto_cancel;
        public LinearLayout lmr_layout_mic;
        public MaterialDesignTextView lmr_txt_Lock;
        public MaterialDesignTextView lmr_btn_mic_layout;
        public ProgressBar chl_prgWaiting;

        public ActivityChat(Context context,ViewGroup parent) {
            this(context,parent, R.layout.activity_chat );
        }

        public ActivityChat(Context context,ViewGroup parent, int layout) {
            root = (FrameLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            ac_ll_parent = (FrameLayout) root.findViewById( R.id.ac_ll_parent);
            ac_appBarLayout = (MyAppBarLayout) root.findViewById( R.id.ac_appBarLayout);
            toolbarContainer = (LinearLayout) root.findViewById( R.id.toolbarContainer);
            toolbar = (LinearLayout) root.findViewById( R.id.toolbar);
            chl_ripple_back_Button = (RippleView) root.findViewById( R.id.chl_ripple_back_Button);
            chl_imv_back_Button = (MaterialDesignTextView) root.findViewById( R.id.chl_imv_back_Button);
            ac_txt_cloud = (MaterialDesignTextView) root.findViewById( R.id.ac_txt_cloud);
            chl_imv_user_picture = (CircleImageView) root.findViewById( R.id.chl_imv_user_picture);
            lyt_user = (LinearLayout) root.findViewById( R.id.lyt_user);
            chl_txt_name = (EmojiTextViewE) root.findViewById( R.id.chl_txt_name);
            imgMutedRoom = (MaterialDesignTextView) root.findViewById( R.id.imgMutedRoom);
            ac_txt_verify = (AppCompatImageView) root.findViewById( R.id.ac_txt_verify);
            chl_txt_viewGroup_seen = (LinearLayout) root.findViewById( R.id.chl_txt_viewGroup_seen);
            chl_txt_last_seen = (EmojiTextViewE) root.findViewById( R.id.chl_txt_last_seen);
            acp_ripple_call = (RippleView) root.findViewById( R.id.acp_ripple_call);
            chl_ripple_menu_button = (RippleView) root.findViewById( R.id.chl_ripple_menu_button);
            chl_imv_menu_button = (MaterialDesignTextView) root.findViewById( R.id.chl_imv_menu_button);
            chl_ll_appbar_selelected = (LinearLayout) root.findViewById( R.id.chl_ll_appbar_selelected);
            chl_ripple_close_layout = (RippleView) root.findViewById( R.id.chl_ripple_close_layout);
            chl_btn_close_layout = (MaterialDesignTextView) root.findViewById( R.id.chl_btn_close_layout);
            chl_txt_number_of_selected = (TextView) root.findViewById( R.id.chl_txt_number_of_selected);
            chl_ripple_replay_selected = (RippleView) root.findViewById( R.id.chl_ripple_replay_selected);
            chl_btn_replay_selected = (MaterialDesignTextView) root.findViewById( R.id.chl_btn_replay_selected);
            chl_ripple_copy_selected = (RippleView) root.findViewById( R.id.chl_ripple_copy_selected);
            chl_btn_copy_selected = (MaterialDesignTextView) root.findViewById( R.id.chl_btn_copy_selected);
            chl_ripple_forward_selected = (RippleView) root.findViewById( R.id.chl_ripple_forward_selected);
            chl_btn_forward_selected = (MaterialDesignTextView) root.findViewById( R.id.chl_btn_forward_selected);
            chl_ripple_delete_selected = (RippleView) root.findViewById( R.id.chl_ripple_delete_selected);
            chl_btn_delete_selected = (MaterialDesignTextView) root.findViewById( R.id.chl_btn_delete_selected);
            ac_ll_search_message = (LinearLayout) root.findViewById( R.id.ac_ll_search_message);
            chl_ripple_back = (RippleView) root.findViewById( R.id.chl_ripple_back);
            chl_edt_search_message = (MEditText) root.findViewById( R.id.chl_edt_search_message);
            chl_btn_close_ripple_search_message = (RippleView) root.findViewById( R.id.chl_btn_close_ripple_search_message);
            ac_btn_clear_message_search = (MaterialDesignTextView) root.findViewById( R.id.ac_btn_clear_message_search);
            mls_btn_play_music = (MaterialDesignTextView) root.findViewById( R.id.mls_btn_play_music);
            mls_txt_music_name = (TextView) root.findViewById( R.id.mls_txt_music_name);
            mls_txt_music_time_counter = (TextView) root.findViewById( R.id.mls_txt_music_time_counter);
            mls_txt_music_time = (TextView) root.findViewById( R.id.mls_txt_music_time);
            mls_btn_close = (MaterialDesignTextView) root.findViewById( R.id.mls_btn_close);
            cslcs_btn_call_strip = (TextView) root.findViewById( R.id.cslcs_btn_call_strip);
            cslcs_txt_timer = (TextView) root.findViewById( R.id.cslcs_txt_timer);
            chat_txt_addContact = (TextView) root.findViewById( R.id.chat_txt_addContact);
            chat_txt_close = (MaterialDesignTextView) root.findViewById( R.id.chat_txt_close);
            chl_img_view_chat = (ImageView) root.findViewById( R.id.chl_img_view_chat);
            chl_recycler_view_chat = (RecyclerView) root.findViewById( R.id.chl_recycler_view_chat);
            ac_ll_scrool_navigate = (FrameLayout) root.findViewById( R.id.ac_ll_scrool_navigate);
            ac_txt_down_navigation = (MaterialDesignTextView) root.findViewById( R.id.ac_txt_down_navigation);
            cs_txt_unread_message = (TextView) root.findViewById( R.id.cs_txt_unread_message);
            empty_messages = (TextView) root.findViewById( R.id.empty_messages);
            ac_ll_attach_text = (LinearLayout) root.findViewById( R.id.ac_ll_attach_text);
            ac_txt_file_neme_for_sending = (TextView) root.findViewById( R.id.ac_txt_file_neme_for_sending);
            ac_btn_cancel_sending_file = (MaterialDesignTextView) root.findViewById( R.id.ac_btn_cancel_sending_file);
            ac_ll_hash_navigation = (LinearLayout) root.findViewById( R.id.ac_ll_hash_navigation);
            ac_btn_hash_up = (MaterialDesignTextView) root.findViewById( R.id.ac_btn_hash_up);
            ac_txt_hash_counter = (TextView) root.findViewById( R.id.ac_txt_hash_counter);
            ac_btn_hash_down = (MaterialDesignTextView) root.findViewById( R.id.ac_btn_hash_down);
            ac_btn_hash_close = (MaterialDesignTextView) root.findViewById( R.id.ac_btn_hash_close);
            replayLayoutStub = (ViewStubCompat) root.findViewById( R.id.replayLayoutStub);
            cslhs_imv_forward = (ImageView) root.findViewById( R.id.cslhs_imv_forward);
            cslhf_imv_thumbnail = (ImageView) root.findViewById( R.id.cslhf_imv_thumbnail);
            cslhf_txt_forward_from = (EmojiTextViewE) root.findViewById( R.id.cslhf_txt_forward_from);
            cslhf_txt_message = (EmojiTextViewE) root.findViewById( R.id.cslhf_txt_message);
            cslhf_imv_cansel = (MaterialDesignTextView) root.findViewById( R.id.cslhf_imv_cansel);
            chl_ll_attach = (LinearLayout) root.findViewById( R.id.chl_ll_attach);
            chl_imv_smile_button = (MaterialDesignTextView) root.findViewById( R.id.chl_imv_smile_button);
            chl_edt_chat = (EmojiEditTextE) root.findViewById( R.id.chl_edt_chat);
            chl_imv_send_button = (MaterialDesignTextView) root.findViewById( R.id.chl_imv_send_button);
            layoutAttachBottom = (LinearLayout) root.findViewById( R.id.layoutAttachBottom);
            chl_imv_attach_button = (MaterialDesignTextView) root.findViewById( R.id.chl_imv_attach_button);
            chl_imv_mic_button = (MaterialDesignTextView) root.findViewById( R.id.chl_imv_mic_button);
            ac_ll_join = (LinearLayout) root.findViewById( R.id.ac_ll_join);
            ac_txt_join = (TextView) root.findViewById( R.id.ac_txt_join);
            chl_ll_channel_footer = (RelativeLayout) root.findViewById( R.id.chl_ll_channel_footer);
            chl_txt_mute_channel = (TextView) root.findViewById( R.id.chl_txt_mute_channel);
            img_pic_record = (ImageView) root.findViewById( R.id.img_pic_record);
            txt_time_record = (TextView) root.findViewById( R.id.txt_time_record);
            txt_time_mili_secend = (TextView) root.findViewById( R.id.txt_time_mili_secend);
            txt_slideto_cancel = (TextView) root.findViewById( R.id.txt_slideto_cancel);
            lmr_layout_mic = (LinearLayout) root.findViewById( R.id.lmr_layout_mic);
            lmr_txt_Lock = (MaterialDesignTextView) root.findViewById( R.id.lmr_txt_Lock);
            lmr_btn_mic_layout = (MaterialDesignTextView) root.findViewById( R.id.lmr_btn_mic_layout);
            chl_prgWaiting = (ProgressBar) root.findViewById( R.id.chl_prgWaiting);
        }

        public ActivityChat(Context context) {
            this(context ,null);
        }

        public ActivityChat(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.activity_chat;
            public static int ac_ll_parent = R.id.ac_ll_parent;
            public static int ac_appBarLayout = R.id.ac_appBarLayout;
            public static int toolbarContainer = R.id.toolbarContainer;
            public static int toolbar = R.id.toolbar;
            public static int chl_ripple_back_Button = R.id.chl_ripple_back_Button;
            public static int chl_imv_back_Button = R.id.chl_imv_back_Button;
            public static int ac_txt_cloud = R.id.ac_txt_cloud;
            public static int chl_imv_user_picture = R.id.chl_imv_user_picture;
            public static int lyt_user = R.id.lyt_user;
            public static int chl_txt_name = R.id.chl_txt_name;
            public static int imgMutedRoom = R.id.imgMutedRoom;
            public static int ac_txt_verify = R.id.ac_txt_verify;
            public static int chl_txt_viewGroup_seen = R.id.chl_txt_viewGroup_seen;
            public static int chl_txt_last_seen = R.id.chl_txt_last_seen;
            public static int acp_ripple_call = R.id.acp_ripple_call;
            public static int chl_ripple_menu_button = R.id.chl_ripple_menu_button;
            public static int chl_imv_menu_button = R.id.chl_imv_menu_button;
            public static int chl_ll_appbar_selelected = R.id.chl_ll_appbar_selelected;
            public static int chl_ripple_close_layout = R.id.chl_ripple_close_layout;
            public static int chl_btn_close_layout = R.id.chl_btn_close_layout;
            public static int chl_txt_number_of_selected = R.id.chl_txt_number_of_selected;
            public static int chl_ripple_replay_selected = R.id.chl_ripple_replay_selected;
            public static int chl_btn_replay_selected = R.id.chl_btn_replay_selected;
            public static int chl_ripple_copy_selected = R.id.chl_ripple_copy_selected;
            public static int chl_btn_copy_selected = R.id.chl_btn_copy_selected;
            public static int chl_ripple_forward_selected = R.id.chl_ripple_forward_selected;
            public static int chl_btn_forward_selected = R.id.chl_btn_forward_selected;
            public static int chl_ripple_delete_selected = R.id.chl_ripple_delete_selected;
            public static int chl_btn_delete_selected = R.id.chl_btn_delete_selected;
            public static int ac_ll_search_message = R.id.ac_ll_search_message;
            public static int chl_ripple_back = R.id.chl_ripple_back;
            public static int chl_edt_search_message = R.id.chl_edt_search_message;
            public static int chl_btn_close_ripple_search_message = R.id.chl_btn_close_ripple_search_message;
            public static int ac_btn_clear_message_search = R.id.ac_btn_clear_message_search;
            public static int mls_btn_play_music = R.id.mls_btn_play_music;
            public static int mls_txt_music_name = R.id.mls_txt_music_name;
            public static int mls_txt_music_time_counter = R.id.mls_txt_music_time_counter;
            public static int mls_txt_music_time = R.id.mls_txt_music_time;
            public static int mls_btn_close = R.id.mls_btn_close;
            public static int cslcs_btn_call_strip = R.id.cslcs_btn_call_strip;
            public static int cslcs_txt_timer = R.id.cslcs_txt_timer;
            public static int chat_txt_addContact = R.id.chat_txt_addContact;
            public static int chat_txt_close = R.id.chat_txt_close;
            public static int chl_img_view_chat = R.id.chl_img_view_chat;
            public static int chl_recycler_view_chat = R.id.chl_recycler_view_chat;
            public static int ac_ll_scrool_navigate = R.id.ac_ll_scrool_navigate;
            public static int ac_txt_down_navigation = R.id.ac_txt_down_navigation;
            public static int cs_txt_unread_message = R.id.cs_txt_unread_message;
            public static int empty_messages = R.id.empty_messages;
            public static int ac_ll_attach_text = R.id.ac_ll_attach_text;
            public static int ac_txt_file_neme_for_sending = R.id.ac_txt_file_neme_for_sending;
            public static int ac_btn_cancel_sending_file = R.id.ac_btn_cancel_sending_file;
            public static int ac_ll_hash_navigation = R.id.ac_ll_hash_navigation;
            public static int ac_btn_hash_up = R.id.ac_btn_hash_up;
            public static int ac_txt_hash_counter = R.id.ac_txt_hash_counter;
            public static int ac_btn_hash_down = R.id.ac_btn_hash_down;
            public static int ac_btn_hash_close = R.id.ac_btn_hash_close;
            public static int replayLayoutStub = R.id.replayLayoutStub;
            public static int cslhs_imv_forward = R.id.cslhs_imv_forward;
            public static int cslhf_imv_thumbnail = R.id.cslhf_imv_thumbnail;
            public static int cslhf_txt_forward_from = R.id.cslhf_txt_forward_from;
            public static int cslhf_txt_message = R.id.cslhf_txt_message;
            public static int cslhf_imv_cansel = R.id.cslhf_imv_cansel;
            public static int chl_ll_attach = R.id.chl_ll_attach;
            public static int chl_imv_smile_button = R.id.chl_imv_smile_button;
            public static int chl_edt_chat = R.id.chl_edt_chat;
            public static int chl_imv_send_button = R.id.chl_imv_send_button;
            public static int layoutAttachBottom = R.id.layoutAttachBottom;
            public static int chl_imv_attach_button = R.id.chl_imv_attach_button;
            public static int chl_imv_mic_button = R.id.chl_imv_mic_button;
            public static int ac_ll_join = R.id.ac_ll_join;
            public static int ac_txt_join = R.id.ac_txt_join;
            public static int chl_ll_channel_footer = R.id.chl_ll_channel_footer;
            public static int chl_txt_mute_channel = R.id.chl_txt_mute_channel;
            public static int img_pic_record = R.id.img_pic_record;
            public static int txt_time_record = R.id.txt_time_record;
            public static int txt_time_mili_secend = R.id.txt_time_mili_secend;
            public static int txt_slideto_cancel = R.id.txt_slideto_cancel;
            public static int lmr_layout_mic = R.id.lmr_layout_mic;
            public static int lmr_txt_Lock = R.id.lmr_txt_Lock;
            public static int lmr_btn_mic_layout = R.id.lmr_btn_mic_layout;
            public static int chl_prgWaiting = R.id.chl_prgWaiting;
        }
    }

    public static class ActivityChatBackground {
        public LinearLayout root;
        public LinearLayout stcb_root;
        public AppBarLayout stcb_appbar;
        public Toolbar stcb_backgroundToolbar;
        public RippleView stcb_ripple_back;
        public MaterialDesignTextView stcb_txt_back;
        public TextView st_txt_titleToolbar;
        public RippleView stcbf_ripple_set_default;
        public MaterialDesignTextView stcbf_txt_set_default;
        public RippleView stcbf_ripple_set;
        public MaterialDesignTextView stcbf_txt_set;
        public ImageView stchf_fullImage;
        public RecyclerView rcvContent;

        public ActivityChatBackground(Context context,ViewGroup parent) {
            this(context,parent, R.layout.activity_chat_background );
        }

        public ActivityChatBackground(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            stcb_root = (LinearLayout) root.findViewById( R.id.stcb_root);
            stcb_appbar = (AppBarLayout) root.findViewById( R.id.stcb_appbar);
            stcb_backgroundToolbar = (Toolbar) root.findViewById( R.id.stcb_backgroundToolbar);
            stcb_ripple_back = (RippleView) root.findViewById( R.id.stcb_ripple_back);
            stcb_txt_back = (MaterialDesignTextView) root.findViewById( R.id.stcb_txt_back);
            st_txt_titleToolbar = (TextView) root.findViewById( R.id.st_txt_titleToolbar);
            stcbf_ripple_set_default = (RippleView) root.findViewById( R.id.stcbf_ripple_set_default);
            stcbf_txt_set_default = (MaterialDesignTextView) root.findViewById( R.id.stcbf_txt_set_default);
            stcbf_ripple_set = (RippleView) root.findViewById( R.id.stcbf_ripple_set);
            stcbf_txt_set = (MaterialDesignTextView) root.findViewById( R.id.stcbf_txt_set);
            stchf_fullImage = (ImageView) root.findViewById( R.id.stchf_fullImage);
            rcvContent = (RecyclerView) root.findViewById( R.id.rcvContent);
        }

        public ActivityChatBackground(Context context) {
            this(context ,null);
        }

        public ActivityChatBackground(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.activity_chat_background;
            public static int stcb_root = R.id.stcb_root;
            public static int stcb_appbar = R.id.stcb_appbar;
            public static int stcb_backgroundToolbar = R.id.stcb_backgroundToolbar;
            public static int stcb_ripple_back = R.id.stcb_ripple_back;
            public static int stcb_txt_back = R.id.stcb_txt_back;
            public static int st_txt_titleToolbar = R.id.st_txt_titleToolbar;
            public static int stcbf_ripple_set_default = R.id.stcbf_ripple_set_default;
            public static int stcbf_txt_set_default = R.id.stcbf_txt_set_default;
            public static int stcbf_ripple_set = R.id.stcbf_ripple_set;
            public static int stcbf_txt_set = R.id.stcbf_txt_set;
            public static int stchf_fullImage = R.id.stchf_fullImage;
            public static int rcvContent = R.id.rcvContent;
        }
    }

    public static class ActivityCommentShow {
        public LinearLayout root;
        public LinearLayout acs_ll_replay;
        public CircleImageView acs_imv_replay_pic;
        public TextView acs_txt_replay_from;
        public TextView acs_txt_replay_message;
        public MaterialDesignTextView acs_btn_close;
        public RecyclerView acs_recycler_view_comment;
        public LinearLayout acs_ll_toolbar;
        public RippleView acs_ripple_back;
        public MaterialDesignTextView acs_btn_back;
        public TextView acs_txt_number_of_comment;
        public RippleView acs_ripple_menu;
        public MaterialDesignTextView acs_btn_menu;
        public MaterialDesignTextView acs_btn_smile;
        public EmojiEditTextE acs_edt_chat;
        public Button acs_btn_send;

        public ActivityCommentShow(Context context,ViewGroup parent) {
            this(context,parent, R.layout.activity_comment_show );
        }

        public ActivityCommentShow(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            acs_ll_replay = (LinearLayout) root.findViewById( R.id.acs_ll_replay);
            acs_imv_replay_pic = (CircleImageView) root.findViewById( R.id.acs_imv_replay_pic);
            acs_txt_replay_from = (TextView) root.findViewById( R.id.acs_txt_replay_from);
            acs_txt_replay_message = (TextView) root.findViewById( R.id.acs_txt_replay_message);
            acs_btn_close = (MaterialDesignTextView) root.findViewById( R.id.acs_btn_close);
            acs_recycler_view_comment = (RecyclerView) root.findViewById( R.id.acs_recycler_view_comment);
            acs_ll_toolbar = (LinearLayout) root.findViewById( R.id.acs_ll_toolbar);
            acs_ripple_back = (RippleView) root.findViewById( R.id.acs_ripple_back);
            acs_btn_back = (MaterialDesignTextView) root.findViewById( R.id.acs_btn_back);
            acs_txt_number_of_comment = (TextView) root.findViewById( R.id.acs_txt_number_of_comment);
            acs_ripple_menu = (RippleView) root.findViewById( R.id.acs_ripple_menu);
            acs_btn_menu = (MaterialDesignTextView) root.findViewById( R.id.acs_btn_menu);
            acs_btn_smile = (MaterialDesignTextView) root.findViewById( R.id.acs_btn_smile);
            acs_edt_chat = (EmojiEditTextE) root.findViewById( R.id.acs_edt_chat);
            acs_btn_send = (Button) root.findViewById( R.id.acs_btn_send);
        }

        public ActivityCommentShow(Context context) {
            this(context ,null);
        }

        public ActivityCommentShow(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.activity_comment_show;
            public static int acs_ll_replay = R.id.acs_ll_replay;
            public static int acs_imv_replay_pic = R.id.acs_imv_replay_pic;
            public static int acs_txt_replay_from = R.id.acs_txt_replay_from;
            public static int acs_txt_replay_message = R.id.acs_txt_replay_message;
            public static int acs_btn_close = R.id.acs_btn_close;
            public static int acs_recycler_view_comment = R.id.acs_recycler_view_comment;
            public static int acs_ll_toolbar = R.id.acs_ll_toolbar;
            public static int acs_ripple_back = R.id.acs_ripple_back;
            public static int acs_btn_back = R.id.acs_btn_back;
            public static int acs_txt_number_of_comment = R.id.acs_txt_number_of_comment;
            public static int acs_ripple_menu = R.id.acs_ripple_menu;
            public static int acs_btn_menu = R.id.acs_btn_menu;
            public static int acs_btn_smile = R.id.acs_btn_smile;
            public static int acs_edt_chat = R.id.acs_edt_chat;
            public static int acs_btn_send = R.id.acs_btn_send;
        }
    }

    public static class ActivityCrop {
        public RelativeLayout root;
        public ImageView pu_img_imageBefore;
        public ProgressBar crop_prgWaiting;
        public SearchView stfaq_searchView;
        public LinearLayout stfaq_allLayout_toolbar;
        public RippleView pu_ripple_back;
        public MaterialDesignTextView pu_txt_agreeImage;
        public TextView stfaq_txt_titleToolbar;
        public RippleView pu_ripple_crop;
        public MaterialDesignTextView pu_txt_crop;
        public LinearLayout pu_layout_cancel_crop;
        public TextView pu_txt_cancel_crop;
        public TextView pu_txt_set_crop;

        public ActivityCrop(Context context,ViewGroup parent) {
            this(context,parent, R.layout.activity_crop );
        }

        public ActivityCrop(Context context,ViewGroup parent, int layout) {
            root = (RelativeLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            pu_img_imageBefore = (ImageView) root.findViewById( R.id.pu_img_imageBefore);
            crop_prgWaiting = (ProgressBar) root.findViewById( R.id.crop_prgWaiting);
            stfaq_searchView = (SearchView) root.findViewById( R.id.stfaq_searchView);
            stfaq_allLayout_toolbar = (LinearLayout) root.findViewById( R.id.stfaq_allLayout_toolbar);
            pu_ripple_back = (RippleView) root.findViewById( R.id.pu_ripple_back);
            pu_txt_agreeImage = (MaterialDesignTextView) root.findViewById( R.id.pu_txt_agreeImage);
            stfaq_txt_titleToolbar = (TextView) root.findViewById( R.id.stfaq_txt_titleToolbar);
            pu_ripple_crop = (RippleView) root.findViewById( R.id.pu_ripple_crop);
            pu_txt_crop = (MaterialDesignTextView) root.findViewById( R.id.pu_txt_crop);
            pu_layout_cancel_crop = (LinearLayout) root.findViewById( R.id.pu_layout_cancel_crop);
            pu_txt_cancel_crop = (TextView) root.findViewById( R.id.pu_txt_cancel_crop);
            pu_txt_set_crop = (TextView) root.findViewById( R.id.pu_txt_set_crop);
        }

        public ActivityCrop(Context context) {
            this(context ,null);
        }

        public ActivityCrop(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.activity_crop;
            public static int pu_img_imageBefore = R.id.pu_img_imageBefore;
            public static int crop_prgWaiting = R.id.crop_prgWaiting;
            public static int stfaq_searchView = R.id.stfaq_searchView;
            public static int stfaq_allLayout_toolbar = R.id.stfaq_allLayout_toolbar;
            public static int pu_ripple_back = R.id.pu_ripple_back;
            public static int pu_txt_agreeImage = R.id.pu_txt_agreeImage;
            public static int stfaq_txt_titleToolbar = R.id.stfaq_txt_titleToolbar;
            public static int pu_ripple_crop = R.id.pu_ripple_crop;
            public static int pu_txt_crop = R.id.pu_txt_crop;
            public static int pu_layout_cancel_crop = R.id.pu_layout_cancel_crop;
            public static int pu_txt_cancel_crop = R.id.pu_txt_cancel_crop;
            public static int pu_txt_set_crop = R.id.pu_txt_set_crop;
        }
    }

    public static class ActivityCustomError {
        public LinearLayout root;
        public Button restart_button;

        public ActivityCustomError(Context context,ViewGroup parent) {
            this(context,parent, R.layout.activity_custom_error );
        }

        public ActivityCustomError(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            restart_button = (Button) root.findViewById( R.id.restart_button);
        }

        public ActivityCustomError(Context context) {
            this(context ,null);
        }

        public ActivityCustomError(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.activity_custom_error;
            public static int restart_button = R.id.restart_button;
        }
    }

    public static class ActivityExplorer {
        public CoordinatorLayout root;
        public RecyclerView ae_recycler_view_explorer;
        public LinearLayout ae_ll_toolbar;
        public RippleView ae_ripple_back;
        public MaterialDesignTextView ae_btn_back;
        public TextView ae_txt_file_path;
        public MaterialDesignTextView asm_btn_menu;

        public ActivityExplorer(Context context,ViewGroup parent) {
            this(context,parent, R.layout.activity_explorer );
        }

        public ActivityExplorer(Context context,ViewGroup parent, int layout) {
            root = (CoordinatorLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            ae_recycler_view_explorer = (RecyclerView) root.findViewById( R.id.ae_recycler_view_explorer);
            ae_ll_toolbar = (LinearLayout) root.findViewById( R.id.ae_ll_toolbar);
            ae_ripple_back = (RippleView) root.findViewById( R.id.ae_ripple_back);
            ae_btn_back = (MaterialDesignTextView) root.findViewById( R.id.ae_btn_back);
            ae_txt_file_path = (TextView) root.findViewById( R.id.ae_txt_file_path);
            asm_btn_menu = (MaterialDesignTextView) root.findViewById( R.id.asm_btn_menu);
        }

        public ActivityExplorer(Context context) {
            this(context ,null);
        }

        public ActivityExplorer(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.activity_explorer;
            public static int ae_recycler_view_explorer = R.id.ae_recycler_view_explorer;
            public static int ae_ll_toolbar = R.id.ae_ll_toolbar;
            public static int ae_ripple_back = R.id.ae_ripple_back;
            public static int ae_btn_back = R.id.ae_btn_back;
            public static int ae_txt_file_path = R.id.ae_txt_file_path;
            public static int asm_btn_menu = R.id.asm_btn_menu;
        }
    }

    public static class ActivityIntroduce {
        public PercentRelativeLayout root;
        public PercentRelativeLayout ai_layout_root;
        public PercentRelativeLayout int_layout_0;
        public ImageView int_background_one;
        public ImageView int_background_two;
        public RelativeLayout int_layout_1;
        public RelativeLayout int_mainImage;
        public ImageView int_img_logo_introduce;
        public ImageView int_img_security_introduce;
        public ImageView int_img_chat_introduce;
        public ImageView int_img_transfer_introduce;
        public ImageView int_img_call_introduce;
        public ImageView int_img_boy_introduce;
        public LinearLayout int_layout_iGap;
        public TextView int_txt_i_p1_l1;
        public TextView int_txt_p1_l1;
        public TextView int_txt_p1_l2;
        public TextView int_txt_p1_l3;
        public TextView int_txt_p2_l1;
        public JustifiedTextView int_txt_p2_l2;
        public TextView int_txt_p3_l1;
        public JustifiedTextView int_txt_p3_l2;
        public TextView int_txt_p4_l1;
        public JustifiedTextView int_txt_p4_l2;
        public TextView int_txt_p5_l1;
        public JustifiedTextView int_txt_p5_l2;
        public TextView int_txt_p6_l1;
        public JustifiedTextView int_txt_p6_l2;
        public RelativeLayout int_layoutParentCircleImage;
        public CustomCircleImage int_circleButton_introduce;
        public ViewPager int_viewPager_introduce;
        public Button int_btnStart;
        public TextView int_txt_skip;

        public ActivityIntroduce(Context context,ViewGroup parent) {
            this(context,parent, R.layout.activity_introduce );
        }

        public ActivityIntroduce(Context context,ViewGroup parent, int layout) {
            root = (PercentRelativeLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            ai_layout_root = (PercentRelativeLayout) root.findViewById( R.id.ai_layout_root);
            int_layout_0 = (PercentRelativeLayout) root.findViewById( R.id.int_layout_0);
            int_background_one = (ImageView) root.findViewById( R.id.int_background_one);
            int_background_two = (ImageView) root.findViewById( R.id.int_background_two);
            int_layout_1 = (RelativeLayout) root.findViewById( R.id.int_layout_1);
            int_mainImage = (RelativeLayout) root.findViewById( R.id.int_mainImage);
            int_img_logo_introduce = (ImageView) root.findViewById( R.id.int_img_logo_introduce);
            int_img_security_introduce = (ImageView) root.findViewById( R.id.int_img_security_introduce);
            int_img_chat_introduce = (ImageView) root.findViewById( R.id.int_img_chat_introduce);
            int_img_transfer_introduce = (ImageView) root.findViewById( R.id.int_img_transfer_introduce);
            int_img_call_introduce = (ImageView) root.findViewById( R.id.int_img_call_introduce);
            int_img_boy_introduce = (ImageView) root.findViewById( R.id.int_img_boy_introduce);
            int_layout_iGap = (LinearLayout) root.findViewById( R.id.int_layout_iGap);
            int_txt_i_p1_l1 = (TextView) root.findViewById( R.id.int_txt_i_p1_l1);
            int_txt_p1_l1 = (TextView) root.findViewById( R.id.int_txt_p1_l1);
            int_txt_p1_l2 = (TextView) root.findViewById( R.id.int_txt_p1_l2);
            int_txt_p1_l3 = (TextView) root.findViewById( R.id.int_txt_p1_l3);
            int_txt_p2_l1 = (TextView) root.findViewById( R.id.int_txt_p2_l1);
            int_txt_p2_l2 = (JustifiedTextView) root.findViewById( R.id.int_txt_p2_l2);
            int_txt_p3_l1 = (TextView) root.findViewById( R.id.int_txt_p3_l1);
            int_txt_p3_l2 = (JustifiedTextView) root.findViewById( R.id.int_txt_p3_l2);
            int_txt_p4_l1 = (TextView) root.findViewById( R.id.int_txt_p4_l1);
            int_txt_p4_l2 = (JustifiedTextView) root.findViewById( R.id.int_txt_p4_l2);
            int_txt_p5_l1 = (TextView) root.findViewById( R.id.int_txt_p5_l1);
            int_txt_p5_l2 = (JustifiedTextView) root.findViewById( R.id.int_txt_p5_l2);
            int_txt_p6_l1 = (TextView) root.findViewById( R.id.int_txt_p6_l1);
            int_txt_p6_l2 = (JustifiedTextView) root.findViewById( R.id.int_txt_p6_l2);
            int_layoutParentCircleImage = (RelativeLayout) root.findViewById( R.id.int_layoutParentCircleImage);
            int_circleButton_introduce = (CustomCircleImage) root.findViewById( R.id.int_circleButton_introduce);
            int_viewPager_introduce = (ViewPager) root.findViewById( R.id.int_viewPager_introduce);
            int_btnStart = (Button) root.findViewById( R.id.int_btnStart);
            int_txt_skip = (TextView) root.findViewById( R.id.int_txt_skip);
        }

        public ActivityIntroduce(Context context) {
            this(context ,null);
        }

        public ActivityIntroduce(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.activity_introduce;
            public static int ai_layout_root = R.id.ai_layout_root;
            public static int int_layout_0 = R.id.int_layout_0;
            public static int int_background_one = R.id.int_background_one;
            public static int int_background_two = R.id.int_background_two;
            public static int int_layout_1 = R.id.int_layout_1;
            public static int int_mainImage = R.id.int_mainImage;
            public static int int_img_logo_introduce = R.id.int_img_logo_introduce;
            public static int int_img_security_introduce = R.id.int_img_security_introduce;
            public static int int_img_chat_introduce = R.id.int_img_chat_introduce;
            public static int int_img_transfer_introduce = R.id.int_img_transfer_introduce;
            public static int int_img_call_introduce = R.id.int_img_call_introduce;
            public static int int_img_boy_introduce = R.id.int_img_boy_introduce;
            public static int int_layout_iGap = R.id.int_layout_iGap;
            public static int int_txt_i_p1_l1 = R.id.int_txt_i_p1_l1;
            public static int int_txt_p1_l1 = R.id.int_txt_p1_l1;
            public static int int_txt_p1_l2 = R.id.int_txt_p1_l2;
            public static int int_txt_p1_l3 = R.id.int_txt_p1_l3;
            public static int int_txt_p2_l1 = R.id.int_txt_p2_l1;
            public static int int_txt_p2_l2 = R.id.int_txt_p2_l2;
            public static int int_txt_p3_l1 = R.id.int_txt_p3_l1;
            public static int int_txt_p3_l2 = R.id.int_txt_p3_l2;
            public static int int_txt_p4_l1 = R.id.int_txt_p4_l1;
            public static int int_txt_p4_l2 = R.id.int_txt_p4_l2;
            public static int int_txt_p5_l1 = R.id.int_txt_p5_l1;
            public static int int_txt_p5_l2 = R.id.int_txt_p5_l2;
            public static int int_txt_p6_l1 = R.id.int_txt_p6_l1;
            public static int int_txt_p6_l2 = R.id.int_txt_p6_l2;
            public static int int_layoutParentCircleImage = R.id.int_layoutParentCircleImage;
            public static int int_circleButton_introduce = R.id.int_circleButton_introduce;
            public static int int_viewPager_introduce = R.id.int_viewPager_introduce;
            public static int int_btnStart = R.id.int_btnStart;
            public static int int_txt_skip = R.id.int_txt_skip;
        }
    }

    public static class ActivityMain {
        public FrameLayout root;
        public FrameLayout frame_main;
        public DrawerLayout drawer_layout;
        public FrameLayout am_frame_main_container;
        public NotTouchableCoordinatorLayout fragmentContainer;
        public MyAppBarLayout appBarLayout;
        public RelativeLayout rootToolbar;
        public Toolbar main_toolbar;
        public LinearLayout amr_toolbar;
        public LinearLayout amr_ripple_menu;
        public ImageView amr_btn_menu;
        public TextView cl_txt_igap;
        public MaterialDesignTextView am_btn_lock;
        public MaterialDesignTextView am_btn_location;
        public MaterialDesignTextView am_btn_menu;
        public RippleView amr_ripple_search;
        public MaterialDesignTextView amr_btn_search;
        public NavigationTabStrip nts;
        public MaterialDesignTextView mls_btn_play_music;
        public TextView mls_txt_music_name;
        public TextView mls_txt_music_time_counter;
        public TextView mls_txt_music_time;
        public MaterialDesignTextView mls_btn_close;
        public TextView cslcs_btn_call_strip;
        public TextView cslcs_txt_timer;
        public ViewPager viewpager;
        public ArcMenu ac_arc_button_add;
        public FloatingActionButton ac_fab_start_new_chat;
        public FloatingActionButton ac_fab_crate_new_group;
        public FloatingActionButton ac_fab_crate_new_channel;
        public ProgressBar loadingContent;
        public FrameLayout am_frame_chat_container;
        public FrameLayout am_frame_fragment_back;
        public FrameLayout am_frame_fragment_container;
        public NavigationView nav_view;
        public LinearLayout rootMenu;
        public ScrollView scrollView;
        public LinearLayout lm_layout_header;
        public LinearLayout lm_layout_user_picture;
        public CircleImageView lm_imv_user_picture;
        public EmojiTextViewE lm_txt_user_name;
        public TextView lm_txt_phone_number;
        public MaterialDesignTextView lm_txt_cloud;
        public LinearLayout lm_ll_new_chat;
        public MaterialDesignTextView lm_txt_icon_new_chat;
        public TextView textView6;
        public LinearLayout lm_ll_new_group;
        public MaterialDesignTextView lm_txt_icon_group;
        public TextView textView9;
        public LinearLayout lm_ll_new_channle;
        public TextView lm_txt_icon_channel;
        public LinearLayout lm_ll_igap_search;
        public MaterialDesignTextView amr_btn_search;
        public TextView textView4;
        public LinearLayout lm_ll_contacts;
        public MaterialDesignTextView lm_txt_icon_contacts;
        public LinearLayout lm_ll_setting;
        public MaterialDesignTextView lm_txt_icon_setting;
        public LinearLayout lm_ll_map;
        public LinearLayout lm_ll_call;
        public LinearLayout lm_ll_qrCode;
        public MaterialDesignTextView lm_txt_icon_qrCode;
        public LinearLayout lm_ll_invite_friends;
        public MaterialDesignTextView lm_txt_icon_invite_friends;
        public TextView textView2;
        public LinearLayout lm_ll_igap_faq;
        public MaterialDesignTextView lm_txt_icon_igap_faq;
        public TextView textView3;

        public ActivityMain(Context context,ViewGroup parent) {
            this(context,parent, R.layout.activity_main );
        }

        public ActivityMain(Context context,ViewGroup parent, int layout) {
            root = (FrameLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            frame_main = (FrameLayout) root.findViewById( R.id.frame_main);
            drawer_layout = (DrawerLayout) root.findViewById( R.id.drawer_layout);
            am_frame_main_container = (FrameLayout) root.findViewById( R.id.am_frame_main_container);
            fragmentContainer = (NotTouchableCoordinatorLayout) root.findViewById( R.id.fragmentContainer);
            appBarLayout = (MyAppBarLayout) root.findViewById( R.id.appBarLayout);
            rootToolbar = (RelativeLayout) root.findViewById( R.id.rootToolbar);
            main_toolbar = (Toolbar) root.findViewById( R.id.main_toolbar);
            amr_toolbar = (LinearLayout) root.findViewById( R.id.amr_toolbar);
            amr_ripple_menu = (LinearLayout) root.findViewById( R.id.amr_ripple_menu);
            amr_btn_menu = (ImageView) root.findViewById( R.id.amr_btn_menu);
            cl_txt_igap = (TextView) root.findViewById( R.id.cl_txt_igap);
            am_btn_lock = (MaterialDesignTextView) root.findViewById( R.id.am_btn_lock);
            am_btn_location = (MaterialDesignTextView) root.findViewById( R.id.am_btn_location);
            am_btn_menu = (MaterialDesignTextView) root.findViewById( R.id.am_btn_menu);
            amr_ripple_search = (RippleView) root.findViewById( R.id.amr_ripple_search);
            amr_btn_search = (MaterialDesignTextView) root.findViewById( R.id.amr_btn_search);
            nts = (NavigationTabStrip) root.findViewById( R.id.nts);
            mls_btn_play_music = (MaterialDesignTextView) root.findViewById( R.id.mls_btn_play_music);
            mls_txt_music_name = (TextView) root.findViewById( R.id.mls_txt_music_name);
            mls_txt_music_time_counter = (TextView) root.findViewById( R.id.mls_txt_music_time_counter);
            mls_txt_music_time = (TextView) root.findViewById( R.id.mls_txt_music_time);
            mls_btn_close = (MaterialDesignTextView) root.findViewById( R.id.mls_btn_close);
            cslcs_btn_call_strip = (TextView) root.findViewById( R.id.cslcs_btn_call_strip);
            cslcs_txt_timer = (TextView) root.findViewById( R.id.cslcs_txt_timer);
            viewpager = (ViewPager) root.findViewById( R.id.viewpager);
            ac_arc_button_add = (ArcMenu) root.findViewById( R.id.ac_arc_button_add);
            ac_fab_start_new_chat = (FloatingActionButton) root.findViewById( R.id.ac_fab_start_new_chat);
            ac_fab_crate_new_group = (FloatingActionButton) root.findViewById( R.id.ac_fab_crate_new_group);
            ac_fab_crate_new_channel = (FloatingActionButton) root.findViewById( R.id.ac_fab_crate_new_channel);
            loadingContent = (ProgressBar) root.findViewById( R.id.loadingContent);
            am_frame_chat_container = (FrameLayout) root.findViewById( R.id.am_frame_chat_container);
            am_frame_fragment_back = (FrameLayout) root.findViewById( R.id.am_frame_fragment_back);
            am_frame_fragment_container = (FrameLayout) root.findViewById( R.id.am_frame_fragment_container);
            nav_view = (NavigationView) root.findViewById( R.id.nav_view);
            rootMenu = (LinearLayout) root.findViewById( R.id.rootMenu);
            scrollView = (ScrollView) root.findViewById( R.id.scrollView);
            lm_layout_header = (LinearLayout) root.findViewById( R.id.lm_layout_header);
            lm_layout_user_picture = (LinearLayout) root.findViewById( R.id.lm_layout_user_picture);
            lm_imv_user_picture = (CircleImageView) root.findViewById( R.id.lm_imv_user_picture);
            lm_txt_user_name = (EmojiTextViewE) root.findViewById( R.id.lm_txt_user_name);
            lm_txt_phone_number = (TextView) root.findViewById( R.id.lm_txt_phone_number);
            lm_txt_cloud = (MaterialDesignTextView) root.findViewById( R.id.lm_txt_cloud);
            lm_ll_new_chat = (LinearLayout) root.findViewById( R.id.lm_ll_new_chat);
            lm_txt_icon_new_chat = (MaterialDesignTextView) root.findViewById( R.id.lm_txt_icon_new_chat);
            textView6 = (TextView) root.findViewById( R.id.textView6);
            lm_ll_new_group = (LinearLayout) root.findViewById( R.id.lm_ll_new_group);
            lm_txt_icon_group = (MaterialDesignTextView) root.findViewById( R.id.lm_txt_icon_group);
            textView9 = (TextView) root.findViewById( R.id.textView9);
            lm_ll_new_channle = (LinearLayout) root.findViewById( R.id.lm_ll_new_channle);
            lm_txt_icon_channel = (TextView) root.findViewById( R.id.lm_txt_icon_channel);
            lm_ll_igap_search = (LinearLayout) root.findViewById( R.id.lm_ll_igap_search);
            amr_btn_search = (MaterialDesignTextView) root.findViewById( R.id.amr_btn_search);
            textView4 = (TextView) root.findViewById( R.id.textView4);
            lm_ll_contacts = (LinearLayout) root.findViewById( R.id.lm_ll_contacts);
            lm_txt_icon_contacts = (MaterialDesignTextView) root.findViewById( R.id.lm_txt_icon_contacts);
            lm_ll_setting = (LinearLayout) root.findViewById( R.id.lm_ll_setting);
            lm_txt_icon_setting = (MaterialDesignTextView) root.findViewById( R.id.lm_txt_icon_setting);
            lm_ll_map = (LinearLayout) root.findViewById( R.id.lm_ll_map);
            lm_ll_call = (LinearLayout) root.findViewById( R.id.lm_ll_call);
            lm_ll_qrCode = (LinearLayout) root.findViewById( R.id.lm_ll_qrCode);
            lm_txt_icon_qrCode = (MaterialDesignTextView) root.findViewById( R.id.lm_txt_icon_qrCode);
            lm_ll_invite_friends = (LinearLayout) root.findViewById( R.id.lm_ll_invite_friends);
            lm_txt_icon_invite_friends = (MaterialDesignTextView) root.findViewById( R.id.lm_txt_icon_invite_friends);
            textView2 = (TextView) root.findViewById( R.id.textView2);
            lm_ll_igap_faq = (LinearLayout) root.findViewById( R.id.lm_ll_igap_faq);
            lm_txt_icon_igap_faq = (MaterialDesignTextView) root.findViewById( R.id.lm_txt_icon_igap_faq);
            textView3 = (TextView) root.findViewById( R.id.textView3);
        }

        public ActivityMain(Context context) {
            this(context ,null);
        }

        public ActivityMain(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.activity_main;
            public static int frame_main = R.id.frame_main;
            public static int drawer_layout = R.id.drawer_layout;
            public static int am_frame_main_container = R.id.am_frame_main_container;
            public static int fragmentContainer = R.id.fragmentContainer;
            public static int appBarLayout = R.id.appBarLayout;
            public static int rootToolbar = R.id.rootToolbar;
            public static int main_toolbar = R.id.main_toolbar;
            public static int amr_toolbar = R.id.amr_toolbar;
            public static int amr_ripple_menu = R.id.amr_ripple_menu;
            public static int amr_btn_menu = R.id.amr_btn_menu;
            public static int cl_txt_igap = R.id.cl_txt_igap;
            public static int am_btn_lock = R.id.am_btn_lock;
            public static int am_btn_location = R.id.am_btn_location;
            public static int am_btn_menu = R.id.am_btn_menu;
            public static int amr_ripple_search = R.id.amr_ripple_search;
            public static int amr_btn_search = R.id.amr_btn_search;
            public static int nts = R.id.nts;
            public static int mls_btn_play_music = R.id.mls_btn_play_music;
            public static int mls_txt_music_name = R.id.mls_txt_music_name;
            public static int mls_txt_music_time_counter = R.id.mls_txt_music_time_counter;
            public static int mls_txt_music_time = R.id.mls_txt_music_time;
            public static int mls_btn_close = R.id.mls_btn_close;
            public static int cslcs_btn_call_strip = R.id.cslcs_btn_call_strip;
            public static int cslcs_txt_timer = R.id.cslcs_txt_timer;
            public static int viewpager = R.id.viewpager;
            public static int ac_arc_button_add = R.id.ac_arc_button_add;
            public static int ac_fab_start_new_chat = R.id.ac_fab_start_new_chat;
            public static int ac_fab_crate_new_group = R.id.ac_fab_crate_new_group;
            public static int ac_fab_crate_new_channel = R.id.ac_fab_crate_new_channel;
            public static int loadingContent = R.id.loadingContent;
            public static int am_frame_chat_container = R.id.am_frame_chat_container;
            public static int am_frame_fragment_back = R.id.am_frame_fragment_back;
            public static int am_frame_fragment_container = R.id.am_frame_fragment_container;
            public static int nav_view = R.id.nav_view;
            public static int rootMenu = R.id.rootMenu;
            public static int scrollView = R.id.scrollView;
            public static int lm_layout_header = R.id.lm_layout_header;
            public static int lm_layout_user_picture = R.id.lm_layout_user_picture;
            public static int lm_imv_user_picture = R.id.lm_imv_user_picture;
            public static int lm_txt_user_name = R.id.lm_txt_user_name;
            public static int lm_txt_phone_number = R.id.lm_txt_phone_number;
            public static int lm_txt_cloud = R.id.lm_txt_cloud;
            public static int lm_ll_new_chat = R.id.lm_ll_new_chat;
            public static int lm_txt_icon_new_chat = R.id.lm_txt_icon_new_chat;
            public static int textView6 = R.id.textView6;
            public static int lm_ll_new_group = R.id.lm_ll_new_group;
            public static int lm_txt_icon_group = R.id.lm_txt_icon_group;
            public static int textView9 = R.id.textView9;
            public static int lm_ll_new_channle = R.id.lm_ll_new_channle;
            public static int lm_txt_icon_channel = R.id.lm_txt_icon_channel;
            public static int lm_ll_igap_search = R.id.lm_ll_igap_search;
            public static int amr_btn_search = R.id.amr_btn_search;
            public static int textView4 = R.id.textView4;
            public static int lm_ll_contacts = R.id.lm_ll_contacts;
            public static int lm_txt_icon_contacts = R.id.lm_txt_icon_contacts;
            public static int lm_ll_setting = R.id.lm_ll_setting;
            public static int lm_txt_icon_setting = R.id.lm_txt_icon_setting;
            public static int lm_ll_map = R.id.lm_ll_map;
            public static int lm_ll_call = R.id.lm_ll_call;
            public static int lm_ll_qrCode = R.id.lm_ll_qrCode;
            public static int lm_txt_icon_qrCode = R.id.lm_txt_icon_qrCode;
            public static int lm_ll_invite_friends = R.id.lm_ll_invite_friends;
            public static int lm_txt_icon_invite_friends = R.id.lm_txt_icon_invite_friends;
            public static int textView2 = R.id.textView2;
            public static int lm_ll_igap_faq = R.id.lm_ll_igap_faq;
            public static int lm_txt_icon_igap_faq = R.id.lm_txt_icon_igap_faq;
            public static int textView3 = R.id.textView3;
        }
    }

    public static class ActivityMainRooms {
        public NotTouchableCoordinatorLayout root;
        public SwipeRefreshLayout activity_main_swipe_refresh_layout;
        public RecyclerView cl_recycler_view_contact;
        public ProgressBar ac_progress_bar_waiting;
        public ImageView imageView3;
        public TextView textView7;

        public ActivityMainRooms(Context context,ViewGroup parent) {
            this(context,parent, R.layout.activity_main_rooms );
        }

        public ActivityMainRooms(Context context,ViewGroup parent, int layout) {
            root = (NotTouchableCoordinatorLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            activity_main_swipe_refresh_layout = (SwipeRefreshLayout) root.findViewById( R.id.activity_main_swipe_refresh_layout);
            cl_recycler_view_contact = (RecyclerView) root.findViewById( R.id.cl_recycler_view_contact);
            ac_progress_bar_waiting = (ProgressBar) root.findViewById( R.id.ac_progress_bar_waiting);
            imageView3 = (ImageView) root.findViewById( R.id.imageView3);
            textView7 = (TextView) root.findViewById( R.id.textView7);
        }

        public ActivityMainRooms(Context context) {
            this(context ,null);
        }

        public ActivityMainRooms(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.activity_main_rooms;
            public static int activity_main_swipe_refresh_layout = R.id.activity_main_swipe_refresh_layout;
            public static int cl_recycler_view_contact = R.id.cl_recycler_view_contact;
            public static int ac_progress_bar_waiting = R.id.ac_progress_bar_waiting;
            public static int imageView3 = R.id.imageView3;
            public static int textView7 = R.id.textView7;
        }
    }

    public static class ActivityPaint {
        public LinearLayout root;
        public FrameLayout frame;
        public TextView textView_erase;
        public MaterialDesignTextView textView_paintsize;
        public MaterialDesignTextView textView_color;
        public MaterialDesignTextView textView_sience;
        public MaterialDesignTextView textView_camera;
        public MaterialDesignTextView textView_close;
        public MaterialDesignTextView textView_new;
        public MaterialDesignTextView textView_save;
        public MaterialDesignTextView textView_send;

        public ActivityPaint(Context context,ViewGroup parent) {
            this(context,parent, R.layout.activity_paint );
        }

        public ActivityPaint(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            frame = (FrameLayout) root.findViewById( R.id.frame);
            textView_erase = (TextView) root.findViewById( R.id.textView_erase);
            textView_paintsize = (MaterialDesignTextView) root.findViewById( R.id.textView_paintsize);
            textView_color = (MaterialDesignTextView) root.findViewById( R.id.textView_color);
            textView_sience = (MaterialDesignTextView) root.findViewById( R.id.textView_sience);
            textView_camera = (MaterialDesignTextView) root.findViewById( R.id.textView_camera);
            textView_close = (MaterialDesignTextView) root.findViewById( R.id.textView_close);
            textView_new = (MaterialDesignTextView) root.findViewById( R.id.textView_new);
            textView_save = (MaterialDesignTextView) root.findViewById( R.id.textView_save);
            textView_send = (MaterialDesignTextView) root.findViewById( R.id.textView_send);
        }

        public ActivityPaint(Context context) {
            this(context ,null);
        }

        public ActivityPaint(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.activity_paint;
            public static int frame = R.id.frame;
            public static int textView_erase = R.id.textView_erase;
            public static int textView_paintsize = R.id.textView_paintsize;
            public static int textView_color = R.id.textView_color;
            public static int textView_sience = R.id.textView_sience;
            public static int textView_camera = R.id.textView_camera;
            public static int textView_close = R.id.textView_close;
            public static int textView_new = R.id.textView_new;
            public static int textView_save = R.id.textView_save;
            public static int textView_send = R.id.textView_send;
        }
    }

    public static class ActivityPopupNotification {
        public LinearLayout root;
        public LinearLayout ac_ll_parent_notification;
        public LinearLayout apn_ll_toolbar;
        public RippleView apn_ripple_back_Button;
        public Button apn_btn_message_counter;
        public TextView apn_txt_name;
        public TextView apn_txt_last_seen;
        public CircleImageView apn_imv_user_picture;
        public ViewPager apn_view_pager;
        public ImageView img_pic_record;
        public TextView txt_time_record;
        public TextView txt_time_mili_secend;
        public TextView txt_slideto_cancel;
        public LinearLayout lmr_layout_mic;
        public MaterialDesignTextView lmr_txt_Lock;
        public MaterialDesignTextView lmr_btn_mic_layout;
        public LinearLayout apn_layout_attach_file;
        public MaterialDesignTextView apn_btn_smile_button;
        public EmojiEditTextE apn_edt_chat;
        public MaterialDesignTextView apn_btn_send;
        public MaterialDesignTextView apn_btn_mic;

        public ActivityPopupNotification(Context context,ViewGroup parent) {
            this(context,parent, R.layout.activity_popup_notification );
        }

        public ActivityPopupNotification(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            ac_ll_parent_notification = (LinearLayout) root.findViewById( R.id.ac_ll_parent_notification);
            apn_ll_toolbar = (LinearLayout) root.findViewById( R.id.apn_ll_toolbar);
            apn_ripple_back_Button = (RippleView) root.findViewById( R.id.apn_ripple_back_Button);
            apn_btn_message_counter = (Button) root.findViewById( R.id.apn_btn_message_counter);
            apn_txt_name = (TextView) root.findViewById( R.id.apn_txt_name);
            apn_txt_last_seen = (TextView) root.findViewById( R.id.apn_txt_last_seen);
            apn_imv_user_picture = (CircleImageView) root.findViewById( R.id.apn_imv_user_picture);
            apn_view_pager = (ViewPager) root.findViewById( R.id.apn_view_pager);
            img_pic_record = (ImageView) root.findViewById( R.id.img_pic_record);
            txt_time_record = (TextView) root.findViewById( R.id.txt_time_record);
            txt_time_mili_secend = (TextView) root.findViewById( R.id.txt_time_mili_secend);
            txt_slideto_cancel = (TextView) root.findViewById( R.id.txt_slideto_cancel);
            lmr_layout_mic = (LinearLayout) root.findViewById( R.id.lmr_layout_mic);
            lmr_txt_Lock = (MaterialDesignTextView) root.findViewById( R.id.lmr_txt_Lock);
            lmr_btn_mic_layout = (MaterialDesignTextView) root.findViewById( R.id.lmr_btn_mic_layout);
            apn_layout_attach_file = (LinearLayout) root.findViewById( R.id.apn_layout_attach_file);
            apn_btn_smile_button = (MaterialDesignTextView) root.findViewById( R.id.apn_btn_smile_button);
            apn_edt_chat = (EmojiEditTextE) root.findViewById( R.id.apn_edt_chat);
            apn_btn_send = (MaterialDesignTextView) root.findViewById( R.id.apn_btn_send);
            apn_btn_mic = (MaterialDesignTextView) root.findViewById( R.id.apn_btn_mic);
        }

        public ActivityPopupNotification(Context context) {
            this(context ,null);
        }

        public ActivityPopupNotification(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.activity_popup_notification;
            public static int ac_ll_parent_notification = R.id.ac_ll_parent_notification;
            public static int apn_ll_toolbar = R.id.apn_ll_toolbar;
            public static int apn_ripple_back_Button = R.id.apn_ripple_back_Button;
            public static int apn_btn_message_counter = R.id.apn_btn_message_counter;
            public static int apn_txt_name = R.id.apn_txt_name;
            public static int apn_txt_last_seen = R.id.apn_txt_last_seen;
            public static int apn_imv_user_picture = R.id.apn_imv_user_picture;
            public static int apn_view_pager = R.id.apn_view_pager;
            public static int img_pic_record = R.id.img_pic_record;
            public static int txt_time_record = R.id.txt_time_record;
            public static int txt_time_mili_secend = R.id.txt_time_mili_secend;
            public static int txt_slideto_cancel = R.id.txt_slideto_cancel;
            public static int lmr_layout_mic = R.id.lmr_layout_mic;
            public static int lmr_txt_Lock = R.id.lmr_txt_Lock;
            public static int lmr_btn_mic_layout = R.id.lmr_btn_mic_layout;
            public static int apn_layout_attach_file = R.id.apn_layout_attach_file;
            public static int apn_btn_smile_button = R.id.apn_btn_smile_button;
            public static int apn_edt_chat = R.id.apn_edt_chat;
            public static int apn_btn_send = R.id.apn_btn_send;
            public static int apn_btn_mic = R.id.apn_btn_mic;
        }
    }

    public static class ActivityQrCodeNewDevice {
        public RelativeLayout root;
        public RelativeLayout root_qrCoderView;
        public QRCodeReaderView apvq_qrdecoderview;
        public PointsOverlayView points_overlay_view;

        public ActivityQrCodeNewDevice(Context context,ViewGroup parent) {
            this(context,parent, R.layout.activity_qr_code_new_device );
        }

        public ActivityQrCodeNewDevice(Context context,ViewGroup parent, int layout) {
            root = (RelativeLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            root_qrCoderView = (RelativeLayout) root.findViewById( R.id.root_qrCoderView);
            apvq_qrdecoderview = (QRCodeReaderView) root.findViewById( R.id.apvq_qrdecoderview);
            points_overlay_view = (PointsOverlayView) root.findViewById( R.id.points_overlay_view);
        }

        public ActivityQrCodeNewDevice(Context context) {
            this(context ,null);
        }

        public ActivityQrCodeNewDevice(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.activity_qr_code_new_device;
            public static int root_qrCoderView = R.id.root_qrCoderView;
            public static int apvq_qrdecoderview = R.id.apvq_qrdecoderview;
            public static int points_overlay_view = R.id.points_overlay_view;
        }
    }

    public static class ActivityRatingBar {
        public LinearLayout root;
        public LinearLayout arb_layout_root;

        public ActivityRatingBar(Context context,ViewGroup parent) {
            this(context,parent, R.layout.activity_rating_bar );
        }

        public ActivityRatingBar(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            arb_layout_root = (LinearLayout) root.findViewById( R.id.arb_layout_root);
        }

        public ActivityRatingBar(Context context) {
            this(context ,null);
        }

        public ActivityRatingBar(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.activity_rating_bar;
            public static int arb_layout_root = R.id.arb_layout_root;
        }
    }

    public static class ActivityRegisteration {
        public LinearLayout root;
        public FrameLayout ar_layout_root;

        public ActivityRegisteration(Context context,ViewGroup parent) {
            this(context,parent, R.layout.activity_registeration );
        }

        public ActivityRegisteration(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            ar_layout_root = (FrameLayout) root.findViewById( R.id.ar_layout_root);
        }

        public ActivityRegisteration(Context context) {
            this(context ,null);
        }

        public ActivityRegisteration(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.activity_registeration;
            public static int ar_layout_root = R.id.ar_layout_root;
        }
    }

    public static class ActivitySettingNotification {
        public LinearLayout root;
        public Toolbar asn_toolbar;
        public RippleView stns_ripple_back;
        public MaterialDesignTextView stns_txt_back;
        public TextView stns_txt_alert;
        public ToggleButton stns_toggle_alert;
        public TextView stns_txt_messagePreview;
        public ToggleButton stns_toggle_messagePreview;
        public LinearLayout stns_layout_ledColorMessage;
        public ImageView stns_img_ledColorMessage;
        public LinearLayout stns_layout_vibrate_message;
        public TextView stns_txt_vibrate_message_text;
        public LinearLayout stns_layout_popupNotification_message;
        public TextView stns_txt_popupNotification_message_text;
        public LinearLayout stns_layout_sound_message;
        public TextView stns_txt_sound_text;
        public TextView stns_txt_alert_group;
        public ToggleButton stns_toggle_alert_group;
        public TextView stns_txt_messagePreview_group;
        public ToggleButton stns_toggle_messagePreview_group;
        public LinearLayout stns_layout_ledColor_group;
        public ImageView stns_img_ledColor_group;
        public LinearLayout stns_layout_vibrate_group;
        public TextView stns_txt_vibrate_group_text;
        public LinearLayout stns_layout_popupNotification_group;
        public TextView stns_txt_popupNotification_group_text;
        public LinearLayout stns_layout_sound_group;
        public TextView stns_txt_sound_group_text;
        public TextView stns_txt_app_sound;
        public ToggleButton stns_toggle_app_sound;
        public TextView stns_txt_app_vibrate;
        public ToggleButton stns_toggle_app_vibrate;
        public TextView stns_txt_app_preview;
        public ToggleButton stns_toggle_app_preview;
        public TextView stns_txt_chat_sound;
        public ToggleButton stns_toggle_chat_sound;
        public TextView stns_txt_Contact_joined;
        public ToggleButton stns_toggle_Contact_joined;
        public ToggleButton stns_toggle_pinned_message;
        public TextView stns_txt_pinned_message;
        public TextView stns_txt_title_keep_alive_service;
        public JustifiedTextView stns_txt_keep_alive_service;
        public ToggleButton stns_toggle_keep_alive_service;
        public ToggleButton stns_toggle_background_connection;
        public TextView stns_txt_title_background_connection;
        public TextView stns_txt_background_connection;
        public ToggleButton stns_badge_counter;
        public TextView stns_txt_badge_countent;
        public LinearLayout st_layout_Repeat_Notifications;
        public TextView st_txt_Repeat_Notifications;
        public LinearLayout st_layout_reset_all_notification;

        public ActivitySettingNotification(Context context,ViewGroup parent) {
            this(context,parent, R.layout.activity_setting_notification );
        }

        public ActivitySettingNotification(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            asn_toolbar = (Toolbar) root.findViewById( R.id.asn_toolbar);
            stns_ripple_back = (RippleView) root.findViewById( R.id.stns_ripple_back);
            stns_txt_back = (MaterialDesignTextView) root.findViewById( R.id.stns_txt_back);
            stns_txt_alert = (TextView) root.findViewById( R.id.stns_txt_alert);
            stns_toggle_alert = (ToggleButton) root.findViewById( R.id.stns_toggle_alert);
            stns_txt_messagePreview = (TextView) root.findViewById( R.id.stns_txt_messagePreview);
            stns_toggle_messagePreview = (ToggleButton) root.findViewById( R.id.stns_toggle_messagePreview);
            stns_layout_ledColorMessage = (LinearLayout) root.findViewById( R.id.stns_layout_ledColorMessage);
            stns_img_ledColorMessage = (ImageView) root.findViewById( R.id.stns_img_ledColorMessage);
            stns_layout_vibrate_message = (LinearLayout) root.findViewById( R.id.stns_layout_vibrate_message);
            stns_txt_vibrate_message_text = (TextView) root.findViewById( R.id.stns_txt_vibrate_message_text);
            stns_layout_popupNotification_message = (LinearLayout) root.findViewById( R.id.stns_layout_popupNotification_message);
            stns_txt_popupNotification_message_text = (TextView) root.findViewById( R.id.stns_txt_popupNotification_message_text);
            stns_layout_sound_message = (LinearLayout) root.findViewById( R.id.stns_layout_sound_message);
            stns_txt_sound_text = (TextView) root.findViewById( R.id.stns_txt_sound_text);
            stns_txt_alert_group = (TextView) root.findViewById( R.id.stns_txt_alert_group);
            stns_toggle_alert_group = (ToggleButton) root.findViewById( R.id.stns_toggle_alert_group);
            stns_txt_messagePreview_group = (TextView) root.findViewById( R.id.stns_txt_messagePreview_group);
            stns_toggle_messagePreview_group = (ToggleButton) root.findViewById( R.id.stns_toggle_messagePreview_group);
            stns_layout_ledColor_group = (LinearLayout) root.findViewById( R.id.stns_layout_ledColor_group);
            stns_img_ledColor_group = (ImageView) root.findViewById( R.id.stns_img_ledColor_group);
            stns_layout_vibrate_group = (LinearLayout) root.findViewById( R.id.stns_layout_vibrate_group);
            stns_txt_vibrate_group_text = (TextView) root.findViewById( R.id.stns_txt_vibrate_group_text);
            stns_layout_popupNotification_group = (LinearLayout) root.findViewById( R.id.stns_layout_popupNotification_group);
            stns_txt_popupNotification_group_text = (TextView) root.findViewById( R.id.stns_txt_popupNotification_group_text);
            stns_layout_sound_group = (LinearLayout) root.findViewById( R.id.stns_layout_sound_group);
            stns_txt_sound_group_text = (TextView) root.findViewById( R.id.stns_txt_sound_group_text);
            stns_txt_app_sound = (TextView) root.findViewById( R.id.stns_txt_app_sound);
            stns_toggle_app_sound = (ToggleButton) root.findViewById( R.id.stns_toggle_app_sound);
            stns_txt_app_vibrate = (TextView) root.findViewById( R.id.stns_txt_app_vibrate);
            stns_toggle_app_vibrate = (ToggleButton) root.findViewById( R.id.stns_toggle_app_vibrate);
            stns_txt_app_preview = (TextView) root.findViewById( R.id.stns_txt_app_preview);
            stns_toggle_app_preview = (ToggleButton) root.findViewById( R.id.stns_toggle_app_preview);
            stns_txt_chat_sound = (TextView) root.findViewById( R.id.stns_txt_chat_sound);
            stns_toggle_chat_sound = (ToggleButton) root.findViewById( R.id.stns_toggle_chat_sound);
            stns_txt_Contact_joined = (TextView) root.findViewById( R.id.stns_txt_Contact_joined);
            stns_toggle_Contact_joined = (ToggleButton) root.findViewById( R.id.stns_toggle_Contact_joined);
            stns_toggle_pinned_message = (ToggleButton) root.findViewById( R.id.stns_toggle_pinned_message);
            stns_txt_pinned_message = (TextView) root.findViewById( R.id.stns_txt_pinned_message);
            stns_txt_title_keep_alive_service = (TextView) root.findViewById( R.id.stns_txt_title_keep_alive_service);
            stns_txt_keep_alive_service = (JustifiedTextView) root.findViewById( R.id.stns_txt_keep_alive_service);
            stns_toggle_keep_alive_service = (ToggleButton) root.findViewById( R.id.stns_toggle_keep_alive_service);
            stns_toggle_background_connection = (ToggleButton) root.findViewById( R.id.stns_toggle_background_connection);
            stns_txt_title_background_connection = (TextView) root.findViewById( R.id.stns_txt_title_background_connection);
            stns_txt_background_connection = (TextView) root.findViewById( R.id.stns_txt_background_connection);
            stns_badge_counter = (ToggleButton) root.findViewById( R.id.stns_badge_counter);
            stns_txt_badge_countent = (TextView) root.findViewById( R.id.stns_txt_badge_countent);
            st_layout_Repeat_Notifications = (LinearLayout) root.findViewById( R.id.st_layout_Repeat_Notifications);
            st_txt_Repeat_Notifications = (TextView) root.findViewById( R.id.st_txt_Repeat_Notifications);
            st_layout_reset_all_notification = (LinearLayout) root.findViewById( R.id.st_layout_reset_all_notification);
        }

        public ActivitySettingNotification(Context context) {
            this(context ,null);
        }

        public ActivitySettingNotification(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.activity_setting_notification;
            public static int asn_toolbar = R.id.asn_toolbar;
            public static int stns_ripple_back = R.id.stns_ripple_back;
            public static int stns_txt_back = R.id.stns_txt_back;
            public static int stns_txt_alert = R.id.stns_txt_alert;
            public static int stns_toggle_alert = R.id.stns_toggle_alert;
            public static int stns_txt_messagePreview = R.id.stns_txt_messagePreview;
            public static int stns_toggle_messagePreview = R.id.stns_toggle_messagePreview;
            public static int stns_layout_ledColorMessage = R.id.stns_layout_ledColorMessage;
            public static int stns_img_ledColorMessage = R.id.stns_img_ledColorMessage;
            public static int stns_layout_vibrate_message = R.id.stns_layout_vibrate_message;
            public static int stns_txt_vibrate_message_text = R.id.stns_txt_vibrate_message_text;
            public static int stns_layout_popupNotification_message = R.id.stns_layout_popupNotification_message;
            public static int stns_txt_popupNotification_message_text = R.id.stns_txt_popupNotification_message_text;
            public static int stns_layout_sound_message = R.id.stns_layout_sound_message;
            public static int stns_txt_sound_text = R.id.stns_txt_sound_text;
            public static int stns_txt_alert_group = R.id.stns_txt_alert_group;
            public static int stns_toggle_alert_group = R.id.stns_toggle_alert_group;
            public static int stns_txt_messagePreview_group = R.id.stns_txt_messagePreview_group;
            public static int stns_toggle_messagePreview_group = R.id.stns_toggle_messagePreview_group;
            public static int stns_layout_ledColor_group = R.id.stns_layout_ledColor_group;
            public static int stns_img_ledColor_group = R.id.stns_img_ledColor_group;
            public static int stns_layout_vibrate_group = R.id.stns_layout_vibrate_group;
            public static int stns_txt_vibrate_group_text = R.id.stns_txt_vibrate_group_text;
            public static int stns_layout_popupNotification_group = R.id.stns_layout_popupNotification_group;
            public static int stns_txt_popupNotification_group_text = R.id.stns_txt_popupNotification_group_text;
            public static int stns_layout_sound_group = R.id.stns_layout_sound_group;
            public static int stns_txt_sound_group_text = R.id.stns_txt_sound_group_text;
            public static int stns_txt_app_sound = R.id.stns_txt_app_sound;
            public static int stns_toggle_app_sound = R.id.stns_toggle_app_sound;
            public static int stns_txt_app_vibrate = R.id.stns_txt_app_vibrate;
            public static int stns_toggle_app_vibrate = R.id.stns_toggle_app_vibrate;
            public static int stns_txt_app_preview = R.id.stns_txt_app_preview;
            public static int stns_toggle_app_preview = R.id.stns_toggle_app_preview;
            public static int stns_txt_chat_sound = R.id.stns_txt_chat_sound;
            public static int stns_toggle_chat_sound = R.id.stns_toggle_chat_sound;
            public static int stns_txt_Contact_joined = R.id.stns_txt_Contact_joined;
            public static int stns_toggle_Contact_joined = R.id.stns_toggle_Contact_joined;
            public static int stns_toggle_pinned_message = R.id.stns_toggle_pinned_message;
            public static int stns_txt_pinned_message = R.id.stns_txt_pinned_message;
            public static int stns_txt_title_keep_alive_service = R.id.stns_txt_title_keep_alive_service;
            public static int stns_txt_keep_alive_service = R.id.stns_txt_keep_alive_service;
            public static int stns_toggle_keep_alive_service = R.id.stns_toggle_keep_alive_service;
            public static int stns_toggle_background_connection = R.id.stns_toggle_background_connection;
            public static int stns_txt_title_background_connection = R.id.stns_txt_title_background_connection;
            public static int stns_txt_background_connection = R.id.stns_txt_background_connection;
            public static int stns_badge_counter = R.id.stns_badge_counter;
            public static int stns_txt_badge_countent = R.id.stns_txt_badge_countent;
            public static int st_layout_Repeat_Notifications = R.id.st_layout_Repeat_Notifications;
            public static int st_txt_Repeat_Notifications = R.id.st_txt_Repeat_Notifications;
            public static int st_layout_reset_all_notification = R.id.st_layout_reset_all_notification;
        }
    }

    public static class ActivityShearedMedia {
        public CoordinatorLayout root;
        public CoordinatorLayout asm_ll_parent;
        public RecyclerView asm_recycler_view_sheared_media;
        public AppBarLayout asm_appbar_shared_media;
        public LinearLayout asm_ll_toolbar;
        public RippleView asm_ripple_back;
        public MaterialDesignTextView asm_btn_back;
        public TextView asm_txt_sheared_media;
        public RippleView asm_ripple_menu;
        public MaterialDesignTextView asm_btn_menu;
        public MaterialDesignTextView mls_btn_play_music;
        public TextView mls_txt_music_name;
        public TextView mls_txt_music_time_counter;
        public TextView mls_txt_music_time;
        public MaterialDesignTextView mls_btn_close;
        public LinearLayout asm_ll_appbar_selelected;
        public RippleView asm_ripple_close_layout;
        public MaterialDesignTextView asm_btn_close_layout;
        public TextView asm_txt_number_of_selected;
        public MaterialDesignTextView asm_btn_forward_selected;
        public RippleView asm_riple_delete_selected;
        public ProgressBar asm_progress_bar_waiting;

        public ActivityShearedMedia(Context context,ViewGroup parent) {
            this(context,parent, R.layout.activity_sheared_media );
        }

        public ActivityShearedMedia(Context context,ViewGroup parent, int layout) {
            root = (CoordinatorLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            asm_ll_parent = (CoordinatorLayout) root.findViewById( R.id.asm_ll_parent);
            asm_recycler_view_sheared_media = (RecyclerView) root.findViewById( R.id.asm_recycler_view_sheared_media);
            asm_appbar_shared_media = (AppBarLayout) root.findViewById( R.id.asm_appbar_shared_media);
            asm_ll_toolbar = (LinearLayout) root.findViewById( R.id.asm_ll_toolbar);
            asm_ripple_back = (RippleView) root.findViewById( R.id.asm_ripple_back);
            asm_btn_back = (MaterialDesignTextView) root.findViewById( R.id.asm_btn_back);
            asm_txt_sheared_media = (TextView) root.findViewById( R.id.asm_txt_sheared_media);
            asm_ripple_menu = (RippleView) root.findViewById( R.id.asm_ripple_menu);
            asm_btn_menu = (MaterialDesignTextView) root.findViewById( R.id.asm_btn_menu);
            mls_btn_play_music = (MaterialDesignTextView) root.findViewById( R.id.mls_btn_play_music);
            mls_txt_music_name = (TextView) root.findViewById( R.id.mls_txt_music_name);
            mls_txt_music_time_counter = (TextView) root.findViewById( R.id.mls_txt_music_time_counter);
            mls_txt_music_time = (TextView) root.findViewById( R.id.mls_txt_music_time);
            mls_btn_close = (MaterialDesignTextView) root.findViewById( R.id.mls_btn_close);
            asm_ll_appbar_selelected = (LinearLayout) root.findViewById( R.id.asm_ll_appbar_selelected);
            asm_ripple_close_layout = (RippleView) root.findViewById( R.id.asm_ripple_close_layout);
            asm_btn_close_layout = (MaterialDesignTextView) root.findViewById( R.id.asm_btn_close_layout);
            asm_txt_number_of_selected = (TextView) root.findViewById( R.id.asm_txt_number_of_selected);
            asm_btn_forward_selected = (MaterialDesignTextView) root.findViewById( R.id.asm_btn_forward_selected);
            asm_riple_delete_selected = (RippleView) root.findViewById( R.id.asm_riple_delete_selected);
            asm_progress_bar_waiting = (ProgressBar) root.findViewById( R.id.asm_progress_bar_waiting);
        }

        public ActivityShearedMedia(Context context) {
            this(context ,null);
        }

        public ActivityShearedMedia(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.activity_sheared_media;
            public static int asm_ll_parent = R.id.asm_ll_parent;
            public static int asm_recycler_view_sheared_media = R.id.asm_recycler_view_sheared_media;
            public static int asm_appbar_shared_media = R.id.asm_appbar_shared_media;
            public static int asm_ll_toolbar = R.id.asm_ll_toolbar;
            public static int asm_ripple_back = R.id.asm_ripple_back;
            public static int asm_btn_back = R.id.asm_btn_back;
            public static int asm_txt_sheared_media = R.id.asm_txt_sheared_media;
            public static int asm_ripple_menu = R.id.asm_ripple_menu;
            public static int asm_btn_menu = R.id.asm_btn_menu;
            public static int mls_btn_play_music = R.id.mls_btn_play_music;
            public static int mls_txt_music_name = R.id.mls_txt_music_name;
            public static int mls_txt_music_time_counter = R.id.mls_txt_music_time_counter;
            public static int mls_txt_music_time = R.id.mls_txt_music_time;
            public static int mls_btn_close = R.id.mls_btn_close;
            public static int asm_ll_appbar_selelected = R.id.asm_ll_appbar_selelected;
            public static int asm_ripple_close_layout = R.id.asm_ripple_close_layout;
            public static int asm_btn_close_layout = R.id.asm_btn_close_layout;
            public static int asm_txt_number_of_selected = R.id.asm_txt_number_of_selected;
            public static int asm_btn_forward_selected = R.id.asm_btn_forward_selected;
            public static int asm_riple_delete_selected = R.id.asm_riple_delete_selected;
            public static int asm_progress_bar_waiting = R.id.asm_progress_bar_waiting;
        }
    }

    public static class ActivityShowImage {
        public RelativeLayout root;
        public RelativeLayout rooShowImage;
        public ViewPager asi_view_pager;
        public LinearLayout toolbarShowImage;
        public RippleView asi_ripple_back;
        public MaterialDesignTextView asi_btn_back;
        public TextView asi_txt_image_number;
        public RippleView asi_ripple_menu;
        public MaterialDesignTextView asi_btn_menu;
        public LinearLayout asi_layout_image_name;
        public EmojiTextViewE asi_txt_image_desc;
        public TextView asi_txt_image_name;
        public TextView asi_txt_image_time;
        public TextView asi_txt_image_date;

        public ActivityShowImage(Context context,ViewGroup parent) {
            this(context,parent, R.layout.activity_show_image );
        }

        public ActivityShowImage(Context context,ViewGroup parent, int layout) {
            root = (RelativeLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            rooShowImage = (RelativeLayout) root.findViewById( R.id.rooShowImage);
            asi_view_pager = (ViewPager) root.findViewById( R.id.asi_view_pager);
            toolbarShowImage = (LinearLayout) root.findViewById( R.id.toolbarShowImage);
            asi_ripple_back = (RippleView) root.findViewById( R.id.asi_ripple_back);
            asi_btn_back = (MaterialDesignTextView) root.findViewById( R.id.asi_btn_back);
            asi_txt_image_number = (TextView) root.findViewById( R.id.asi_txt_image_number);
            asi_ripple_menu = (RippleView) root.findViewById( R.id.asi_ripple_menu);
            asi_btn_menu = (MaterialDesignTextView) root.findViewById( R.id.asi_btn_menu);
            asi_layout_image_name = (LinearLayout) root.findViewById( R.id.asi_layout_image_name);
            asi_txt_image_desc = (EmojiTextViewE) root.findViewById( R.id.asi_txt_image_desc);
            asi_txt_image_name = (TextView) root.findViewById( R.id.asi_txt_image_name);
            asi_txt_image_time = (TextView) root.findViewById( R.id.asi_txt_image_time);
            asi_txt_image_date = (TextView) root.findViewById( R.id.asi_txt_image_date);
        }

        public ActivityShowImage(Context context) {
            this(context ,null);
        }

        public ActivityShowImage(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.activity_show_image;
            public static int rooShowImage = R.id.rooShowImage;
            public static int asi_view_pager = R.id.asi_view_pager;
            public static int toolbarShowImage = R.id.toolbarShowImage;
            public static int asi_ripple_back = R.id.asi_ripple_back;
            public static int asi_btn_back = R.id.asi_btn_back;
            public static int asi_txt_image_number = R.id.asi_txt_image_number;
            public static int asi_ripple_menu = R.id.asi_ripple_menu;
            public static int asi_btn_menu = R.id.asi_btn_menu;
            public static int asi_layout_image_name = R.id.asi_layout_image_name;
            public static int asi_txt_image_desc = R.id.asi_txt_image_desc;
            public static int asi_txt_image_name = R.id.asi_txt_image_name;
            public static int asi_txt_image_time = R.id.asi_txt_image_time;
            public static int asi_txt_image_date = R.id.asi_txt_image_date;
        }
    }

    public static class AdapterActiveSessions {
        public LinearLayout root;
        public LinearLayout adp_rootLayout;
        public HeaderTextview adp_currentSession;
        public TextView adp_device;
        public TextView adp_platform;
        public TextView adp_country;
        public TextView adp_terminate;
        public TextView adp_create_time;
        public TextView adp_ip;
        public View adp_line;

        public AdapterActiveSessions(Context context,ViewGroup parent) {
            this(context,parent, R.layout.adapter_active_sessions );
        }

        public AdapterActiveSessions(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            adp_rootLayout = (LinearLayout) root.findViewById( R.id.adp_rootLayout);
            adp_currentSession = (HeaderTextview) root.findViewById( R.id.adp_currentSession);
            adp_device = (TextView) root.findViewById( R.id.adp_device);
            adp_platform = (TextView) root.findViewById( R.id.adp_platform);
            adp_country = (TextView) root.findViewById( R.id.adp_country);
            adp_terminate = (TextView) root.findViewById( R.id.adp_terminate);
            adp_create_time = (TextView) root.findViewById( R.id.adp_create_time);
            adp_ip = (TextView) root.findViewById( R.id.adp_ip);
            adp_line = (View) root.findViewById( R.id.adp_line);
        }

        public AdapterActiveSessions(Context context) {
            this(context ,null);
        }

        public AdapterActiveSessions(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.adapter_active_sessions;
            public static int adp_rootLayout = R.id.adp_rootLayout;
            public static int adp_currentSession = R.id.adp_currentSession;
            public static int adp_device = R.id.adp_device;
            public static int adp_platform = R.id.adp_platform;
            public static int adp_country = R.id.adp_country;
            public static int adp_terminate = R.id.adp_terminate;
            public static int adp_create_time = R.id.adp_create_time;
            public static int adp_ip = R.id.adp_ip;
            public static int adp_line = R.id.adp_line;
        }
    }

    public static class AdapterActiveSessionsHeader {
        public LinearLayout root;
        public LinearLayout adph_rootLayout;

        public AdapterActiveSessionsHeader(Context context,ViewGroup parent) {
            this(context,parent, R.layout.adapter_active_sessions_header );
        }

        public AdapterActiveSessionsHeader(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            adph_rootLayout = (LinearLayout) root.findViewById( R.id.adph_rootLayout);
        }

        public AdapterActiveSessionsHeader(Context context) {
            this(context ,null);
        }

        public AdapterActiveSessionsHeader(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.adapter_active_sessions_header;
            public static int adph_rootLayout = R.id.adph_rootLayout;
        }
    }

    public static class AdapterBackgroundChoose {
        public LinearLayout root;
        public ImageView imgBackgroundImage;

        public AdapterBackgroundChoose(Context context,ViewGroup parent) {
            this(context,parent, R.layout.adapter_background_choose );
        }

        public AdapterBackgroundChoose(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            imgBackgroundImage = (ImageView) root.findViewById( R.id.imgBackgroundImage);
        }

        public AdapterBackgroundChoose(Context context) {
            this(context ,null);
        }

        public AdapterBackgroundChoose(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.adapter_background_choose;
            public static int imgBackgroundImage = R.id.imgBackgroundImage;
        }
    }

    public static class AdapterBackgroundImage {
        public LinearLayout root;
        public ImageView imgBackground;
        public MessageProgress progress;

        public AdapterBackgroundImage(Context context,ViewGroup parent) {
            this(context,parent, R.layout.adapter_background_image );
        }

        public AdapterBackgroundImage(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            imgBackground = (ImageView) root.findViewById( R.id.imgBackground);
            progress = (MessageProgress) root.findViewById( R.id.progress);
        }

        public AdapterBackgroundImage(Context context) {
            this(context ,null);
        }

        public AdapterBackgroundImage(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.adapter_background_image;
            public static int imgBackground = R.id.imgBackground;
            public static int progress = R.id.progress;
        }
    }

    public static class AdapterBottomSheet {
        public LinearLayout root;
        public LinearLayout rcv_root_bottom_sheet;
        public CardView card_view;
        public ImageView img_gallery;
        public AnimateCheckBox cig_checkBox_select_user;

        public AdapterBottomSheet(Context context,ViewGroup parent) {
            this(context,parent, R.layout.adapter_bottom_sheet );
        }

        public AdapterBottomSheet(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            rcv_root_bottom_sheet = (LinearLayout) root.findViewById( R.id.rcv_root_bottom_sheet);
            card_view = (CardView) root.findViewById( R.id.card_view);
            img_gallery = (ImageView) root.findViewById( R.id.img_gallery);
            cig_checkBox_select_user = (AnimateCheckBox) root.findViewById( R.id.cig_checkBox_select_user);
        }

        public AdapterBottomSheet(Context context) {
            this(context ,null);
        }

        public AdapterBottomSheet(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.adapter_bottom_sheet;
            public static int rcv_root_bottom_sheet = R.id.rcv_root_bottom_sheet;
            public static int card_view = R.id.card_view;
            public static int img_gallery = R.id.img_gallery;
            public static int cig_checkBox_select_user = R.id.cig_checkBox_select_user;
        }
    }

    public static class AdapterCamera {
        public LinearLayout root;
        public LinearLayout rootCamera;
        public CameraView cameraView;
        public TextView txtIconCamera;

        public AdapterCamera(Context context,ViewGroup parent) {
            this(context,parent, R.layout.adapter_camera );
        }

        public AdapterCamera(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            rootCamera = (LinearLayout) root.findViewById( R.id.rootCamera);
            cameraView = (CameraView) root.findViewById( R.id.cameraView);
            txtIconCamera = (TextView) root.findViewById( R.id.txtIconCamera);
        }

        public AdapterCamera(Context context) {
            this(context ,null);
        }

        public AdapterCamera(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.adapter_camera;
            public static int rootCamera = R.id.rootCamera;
            public static int cameraView = R.id.cameraView;
            public static int txtIconCamera = R.id.txtIconCamera;
        }
    }

    public static class AdapterForwardBottomSheet {
        public RelativeLayout root;
        public RelativeLayout root_forward_bottom_sheet;
        public LinearLayout main;
        public CircleImageView imageView_forward_bottomSheet;
        public EmojiTextViewE txtTitle_forward_bottomSheet;
        public AnimateCheckBox checkBox_forward_bottomSheet;

        public AdapterForwardBottomSheet(Context context,ViewGroup parent) {
            this(context,parent, R.layout.adapter_forward_bottom_sheet );
        }

        public AdapterForwardBottomSheet(Context context,ViewGroup parent, int layout) {
            root = (RelativeLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            root_forward_bottom_sheet = (RelativeLayout) root.findViewById( R.id.root_forward_bottom_sheet);
            main = (LinearLayout) root.findViewById( R.id.main);
            imageView_forward_bottomSheet = (CircleImageView) root.findViewById( R.id.imageView_forward_bottomSheet);
            txtTitle_forward_bottomSheet = (EmojiTextViewE) root.findViewById( R.id.txtTitle_forward_bottomSheet);
            checkBox_forward_bottomSheet = (AnimateCheckBox) root.findViewById( R.id.checkBox_forward_bottomSheet);
        }

        public AdapterForwardBottomSheet(Context context) {
            this(context ,null);
        }

        public AdapterForwardBottomSheet(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.adapter_forward_bottom_sheet;
            public static int root_forward_bottom_sheet = R.id.root_forward_bottom_sheet;
            public static int main = R.id.main;
            public static int imageView_forward_bottomSheet = R.id.imageView_forward_bottomSheet;
            public static int txtTitle_forward_bottomSheet = R.id.txtTitle_forward_bottomSheet;
            public static int checkBox_forward_bottomSheet = R.id.checkBox_forward_bottomSheet;
        }
    }

    public static class AdapterListCobtact {
        public LinearLayout root;
        public LinearLayout root_List_contact;
        public TextView txtName;
        public TextView txtPhone;

        public AdapterListCobtact(Context context,ViewGroup parent) {
            this(context,parent, R.layout.adapter_list_cobtact );
        }

        public AdapterListCobtact(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            root_List_contact = (LinearLayout) root.findViewById( R.id.root_List_contact);
            txtName = (TextView) root.findViewById( R.id.txtName);
            txtPhone = (TextView) root.findViewById( R.id.txtPhone);
        }

        public AdapterListCobtact(Context context) {
            this(context ,null);
        }

        public AdapterListCobtact(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.adapter_list_cobtact;
            public static int root_List_contact = R.id.root_List_contact;
            public static int txtName = R.id.txtName;
            public static int txtPhone = R.id.txtPhone;
        }
    }

    public static class AdapterListCountry {
        public LinearLayout root;
        public LinearLayout rootAdapterChooseCountry;
        public LinearLayout vgListCountry;
        public TextView txtNameCountry;
        public TextView txtCodeCountry;

        public AdapterListCountry(Context context,ViewGroup parent) {
            this(context,parent, R.layout.adapter_list_country );
        }

        public AdapterListCountry(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            rootAdapterChooseCountry = (LinearLayout) root.findViewById( R.id.rootAdapterChooseCountry);
            vgListCountry = (LinearLayout) root.findViewById( R.id.vgListCountry);
            txtNameCountry = (TextView) root.findViewById( R.id.txtNameCountry);
            txtCodeCountry = (TextView) root.findViewById( R.id.txtCodeCountry);
        }

        public AdapterListCountry(Context context) {
            this(context ,null);
        }

        public AdapterListCountry(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.adapter_list_country;
            public static int rootAdapterChooseCountry = R.id.rootAdapterChooseCountry;
            public static int vgListCountry = R.id.vgListCountry;
            public static int txtNameCountry = R.id.txtNameCountry;
            public static int txtCodeCountry = R.id.txtCodeCountry;
        }
    }

    public static class AdapterListMusicPlayer {
        public LinearLayout root;
        public LinearLayout rootListMusicPlayer;
        public MaterialDesignTextView ml_btn_play_music;
        public MessageProgress progress;
        public TextView txtListMusicPlayer;
        public TextView ml_txt_music_place;

        public AdapterListMusicPlayer(Context context,ViewGroup parent) {
            this(context,parent, R.layout.adapter_list_music_player );
        }

        public AdapterListMusicPlayer(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            rootListMusicPlayer = (LinearLayout) root.findViewById( R.id.rootListMusicPlayer);
            ml_btn_play_music = (MaterialDesignTextView) root.findViewById( R.id.ml_btn_play_music);
            progress = (MessageProgress) root.findViewById( R.id.progress);
            txtListMusicPlayer = (TextView) root.findViewById( R.id.txtListMusicPlayer);
            ml_txt_music_place = (TextView) root.findViewById( R.id.ml_txt_music_place);
        }

        public AdapterListMusicPlayer(Context context) {
            this(context ,null);
        }

        public AdapterListMusicPlayer(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.adapter_list_music_player;
            public static int rootListMusicPlayer = R.id.rootListMusicPlayer;
            public static int ml_btn_play_music = R.id.ml_btn_play_music;
            public static int progress = R.id.progress;
            public static int txtListMusicPlayer = R.id.txtListMusicPlayer;
            public static int ml_txt_music_place = R.id.ml_txt_music_place;
        }
    }

    public static class AdapterSpinnerLayout {
        public LinearLayout root;
        public TextView rowText;

        public AdapterSpinnerLayout(Context context,ViewGroup parent) {
            this(context,parent, R.layout.adapter_spinner_layout );
        }

        public AdapterSpinnerLayout(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            rowText = (TextView) root.findViewById( R.id.rowText);
        }

        public AdapterSpinnerLayout(Context context) {
            this(context ,null);
        }

        public AdapterSpinnerLayout(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.adapter_spinner_layout;
            public static int rowText = R.id.rowText;
        }
    }

    public static class BottomSheet {
        public RelativeLayout root;
        public RelativeLayout cardView;
        public LinearLayout layout_recyclerView;
        public RecyclerView rcvContent;
        public LinearLayout document;
        public TextView txtDocument;
        public LinearLayout music;
        public TextView txtMusic;
        public LinearLayout video;
        public TextView txtVideo;
        public LinearLayout picture;
        public TextView textPicture;
        public LinearLayout camera;
        public TextView txtCamera;
        public TextView textView5;
        public LinearLayout contact;
        public TextView txtContact;
        public LinearLayout location;
        public TextView txtLocation;
        public LinearLayout paint;
        public TextView txtPaint;
        public LinearLayout file;
        public TextView txtFile;
        public LinearLayout close;
        public TextView txtSend;
        public TextView txtNumberItem;

        public BottomSheet(Context context,ViewGroup parent) {
            this(context,parent, R.layout.bottom_sheet );
        }

        public BottomSheet(Context context,ViewGroup parent, int layout) {
            root = (RelativeLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            cardView = (RelativeLayout) root.findViewById( R.id.cardView);
            layout_recyclerView = (LinearLayout) root.findViewById( R.id.layout_recyclerView);
            rcvContent = (RecyclerView) root.findViewById( R.id.rcvContent);
            document = (LinearLayout) root.findViewById( R.id.document);
            txtDocument = (TextView) root.findViewById( R.id.txtDocument);
            music = (LinearLayout) root.findViewById( R.id.music);
            txtMusic = (TextView) root.findViewById( R.id.txtMusic);
            video = (LinearLayout) root.findViewById( R.id.video);
            txtVideo = (TextView) root.findViewById( R.id.txtVideo);
            picture = (LinearLayout) root.findViewById( R.id.picture);
            textPicture = (TextView) root.findViewById( R.id.textPicture);
            camera = (LinearLayout) root.findViewById( R.id.camera);
            txtCamera = (TextView) root.findViewById( R.id.txtCamera);
            textView5 = (TextView) root.findViewById( R.id.textView5);
            contact = (LinearLayout) root.findViewById( R.id.contact);
            txtContact = (TextView) root.findViewById( R.id.txtContact);
            location = (LinearLayout) root.findViewById( R.id.location);
            txtLocation = (TextView) root.findViewById( R.id.txtLocation);
            paint = (LinearLayout) root.findViewById( R.id.paint);
            txtPaint = (TextView) root.findViewById( R.id.txtPaint);
            file = (LinearLayout) root.findViewById( R.id.file);
            txtFile = (TextView) root.findViewById( R.id.txtFile);
            close = (LinearLayout) root.findViewById( R.id.close);
            txtSend = (TextView) root.findViewById( R.id.txtSend);
            txtNumberItem = (TextView) root.findViewById( R.id.txtNumberItem);
        }

        public BottomSheet(Context context) {
            this(context ,null);
        }

        public BottomSheet(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.bottom_sheet;
            public static int cardView = R.id.cardView;
            public static int layout_recyclerView = R.id.layout_recyclerView;
            public static int rcvContent = R.id.rcvContent;
            public static int document = R.id.document;
            public static int txtDocument = R.id.txtDocument;
            public static int music = R.id.music;
            public static int txtMusic = R.id.txtMusic;
            public static int video = R.id.video;
            public static int txtVideo = R.id.txtVideo;
            public static int picture = R.id.picture;
            public static int textPicture = R.id.textPicture;
            public static int camera = R.id.camera;
            public static int txtCamera = R.id.txtCamera;
            public static int textView5 = R.id.textView5;
            public static int contact = R.id.contact;
            public static int txtContact = R.id.txtContact;
            public static int location = R.id.location;
            public static int txtLocation = R.id.txtLocation;
            public static int paint = R.id.paint;
            public static int txtPaint = R.id.txtPaint;
            public static int file = R.id.file;
            public static int txtFile = R.id.txtFile;
            public static int close = R.id.close;
            public static int txtSend = R.id.txtSend;
            public static int txtNumberItem = R.id.txtNumberItem;
        }
    }

    public static class BottomSheetForward {
        public LinearLayout root;
        public RecyclerView rcvBottomSheetForward;
        public MEditText edtSearch;
        public MaterialDesignTextView txtSend;

        public BottomSheetForward(Context context,ViewGroup parent) {
            this(context,parent, R.layout.bottom_sheet_forward );
        }

        public BottomSheetForward(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            rcvBottomSheetForward = (RecyclerView) root.findViewById( R.id.rcvBottomSheetForward);
            edtSearch = (MEditText) root.findViewById( R.id.edtSearch);
            txtSend = (MaterialDesignTextView) root.findViewById( R.id.txtSend);
        }

        public BottomSheetForward(Context context) {
            this(context ,null);
        }

        public BottomSheetForward(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.bottom_sheet_forward;
            public static int rcvBottomSheetForward = R.id.rcvBottomSheetForward;
            public static int edtSearch = R.id.edtSearch;
            public static int txtSend = R.id.txtSend;
        }
    }

    public static class ChatPopupDialog {
        public LinearLayout root;
        public LinearLayout cm_layout_mute_pinToTop;
        public TextView cm_icon_mute_pinToTop;
        public TextView cm_txt_mute_pinToTop;
        public LinearLayout cm_layout_mute_notification;
        public MaterialDesignTextView cm_icon_mute_notification;
        public TextView cm_txt_mute_notification;
        public LinearLayout cm_layout_clear_history;
        public MaterialDesignTextView cm_icon_clear_history;
        public TextView cm_txt_clear_history;
        public LinearLayout cm_layout_delete_chat;
        public MaterialDesignTextView cm_icon_delete_chat;
        public TextView cm_txt_delete_chat;

        public ChatPopupDialog(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_popup_dialog );
        }

        public ChatPopupDialog(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            cm_layout_mute_pinToTop = (LinearLayout) root.findViewById( R.id.cm_layout_mute_pinToTop);
            cm_icon_mute_pinToTop = (TextView) root.findViewById( R.id.cm_icon_mute_pinToTop);
            cm_txt_mute_pinToTop = (TextView) root.findViewById( R.id.cm_txt_mute_pinToTop);
            cm_layout_mute_notification = (LinearLayout) root.findViewById( R.id.cm_layout_mute_notification);
            cm_icon_mute_notification = (MaterialDesignTextView) root.findViewById( R.id.cm_icon_mute_notification);
            cm_txt_mute_notification = (TextView) root.findViewById( R.id.cm_txt_mute_notification);
            cm_layout_clear_history = (LinearLayout) root.findViewById( R.id.cm_layout_clear_history);
            cm_icon_clear_history = (MaterialDesignTextView) root.findViewById( R.id.cm_icon_clear_history);
            cm_txt_clear_history = (TextView) root.findViewById( R.id.cm_txt_clear_history);
            cm_layout_delete_chat = (LinearLayout) root.findViewById( R.id.cm_layout_delete_chat);
            cm_icon_delete_chat = (MaterialDesignTextView) root.findViewById( R.id.cm_icon_delete_chat);
            cm_txt_delete_chat = (TextView) root.findViewById( R.id.cm_txt_delete_chat);
        }

        public ChatPopupDialog(Context context) {
            this(context ,null);
        }

        public ChatPopupDialog(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_popup_dialog;
            public static int cm_layout_mute_pinToTop = R.id.cm_layout_mute_pinToTop;
            public static int cm_icon_mute_pinToTop = R.id.cm_icon_mute_pinToTop;
            public static int cm_txt_mute_pinToTop = R.id.cm_txt_mute_pinToTop;
            public static int cm_layout_mute_notification = R.id.cm_layout_mute_notification;
            public static int cm_icon_mute_notification = R.id.cm_icon_mute_notification;
            public static int cm_txt_mute_notification = R.id.cm_txt_mute_notification;
            public static int cm_layout_clear_history = R.id.cm_layout_clear_history;
            public static int cm_icon_clear_history = R.id.cm_icon_clear_history;
            public static int cm_txt_clear_history = R.id.cm_txt_clear_history;
            public static int cm_layout_delete_chat = R.id.cm_layout_delete_chat;
            public static int cm_icon_delete_chat = R.id.cm_icon_delete_chat;
            public static int cm_txt_delete_chat = R.id.cm_txt_delete_chat;
        }
    }

    public static class ChatPopupDialogCustom {
        public LinearLayout root;
        public LinearLayout dialog_root_item1_notification;
        public MaterialDesignTextView dialog_icon_item1_notification;
        public TextView dialog_text_item1_notification;
        public LinearLayout dialog_root_item2_notification;
        public MaterialDesignTextView dialog_icon_item2_notification;
        public TextView dialog_text_item2_notification;
        public LinearLayout dialog_root_item3_notification;
        public MaterialDesignTextView dialog_icon_item3_notification;
        public TextView dialog_text_item3_notification;
        public LinearLayout dialog_root_item4_notification;
        public MaterialDesignTextView dialog_icon_item4_notification;
        public TextView dialog_text_item4_notification;
        public LinearLayout dialog_root_item5_notification;
        public MaterialDesignTextView dialog_icon_item5_notification;
        public TextView dialog_text_item5_notification;
        public LinearLayout dialog_root_item6_notification;
        public MaterialDesignTextView dialog_icon_item6_notification;
        public TextView dialog_text_item6_notification;
        public LinearLayout dialog_root_item7_notification;
        public MaterialDesignTextView dialog_icon_item7_notification;
        public TextView dialog_text_item7_notification;
        public LinearLayout dialog_root_item8_notification;
        public MaterialDesignTextView dialog_icon_item8_notification;
        public TextView dialog_text_item8_notification;

        public ChatPopupDialogCustom(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_popup_dialog_custom );
        }

        public ChatPopupDialogCustom(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            dialog_root_item1_notification = (LinearLayout) root.findViewById( R.id.dialog_root_item1_notification);
            dialog_icon_item1_notification = (MaterialDesignTextView) root.findViewById( R.id.dialog_icon_item1_notification);
            dialog_text_item1_notification = (TextView) root.findViewById( R.id.dialog_text_item1_notification);
            dialog_root_item2_notification = (LinearLayout) root.findViewById( R.id.dialog_root_item2_notification);
            dialog_icon_item2_notification = (MaterialDesignTextView) root.findViewById( R.id.dialog_icon_item2_notification);
            dialog_text_item2_notification = (TextView) root.findViewById( R.id.dialog_text_item2_notification);
            dialog_root_item3_notification = (LinearLayout) root.findViewById( R.id.dialog_root_item3_notification);
            dialog_icon_item3_notification = (MaterialDesignTextView) root.findViewById( R.id.dialog_icon_item3_notification);
            dialog_text_item3_notification = (TextView) root.findViewById( R.id.dialog_text_item3_notification);
            dialog_root_item4_notification = (LinearLayout) root.findViewById( R.id.dialog_root_item4_notification);
            dialog_icon_item4_notification = (MaterialDesignTextView) root.findViewById( R.id.dialog_icon_item4_notification);
            dialog_text_item4_notification = (TextView) root.findViewById( R.id.dialog_text_item4_notification);
            dialog_root_item5_notification = (LinearLayout) root.findViewById( R.id.dialog_root_item5_notification);
            dialog_icon_item5_notification = (MaterialDesignTextView) root.findViewById( R.id.dialog_icon_item5_notification);
            dialog_text_item5_notification = (TextView) root.findViewById( R.id.dialog_text_item5_notification);
            dialog_root_item6_notification = (LinearLayout) root.findViewById( R.id.dialog_root_item6_notification);
            dialog_icon_item6_notification = (MaterialDesignTextView) root.findViewById( R.id.dialog_icon_item6_notification);
            dialog_text_item6_notification = (TextView) root.findViewById( R.id.dialog_text_item6_notification);
            dialog_root_item7_notification = (LinearLayout) root.findViewById( R.id.dialog_root_item7_notification);
            dialog_icon_item7_notification = (MaterialDesignTextView) root.findViewById( R.id.dialog_icon_item7_notification);
            dialog_text_item7_notification = (TextView) root.findViewById( R.id.dialog_text_item7_notification);
            dialog_root_item8_notification = (LinearLayout) root.findViewById( R.id.dialog_root_item8_notification);
            dialog_icon_item8_notification = (MaterialDesignTextView) root.findViewById( R.id.dialog_icon_item8_notification);
            dialog_text_item8_notification = (TextView) root.findViewById( R.id.dialog_text_item8_notification);
        }

        public ChatPopupDialogCustom(Context context) {
            this(context ,null);
        }

        public ChatPopupDialogCustom(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_popup_dialog_custom;
            public static int dialog_root_item1_notification = R.id.dialog_root_item1_notification;
            public static int dialog_icon_item1_notification = R.id.dialog_icon_item1_notification;
            public static int dialog_text_item1_notification = R.id.dialog_text_item1_notification;
            public static int dialog_root_item2_notification = R.id.dialog_root_item2_notification;
            public static int dialog_icon_item2_notification = R.id.dialog_icon_item2_notification;
            public static int dialog_text_item2_notification = R.id.dialog_text_item2_notification;
            public static int dialog_root_item3_notification = R.id.dialog_root_item3_notification;
            public static int dialog_icon_item3_notification = R.id.dialog_icon_item3_notification;
            public static int dialog_text_item3_notification = R.id.dialog_text_item3_notification;
            public static int dialog_root_item4_notification = R.id.dialog_root_item4_notification;
            public static int dialog_icon_item4_notification = R.id.dialog_icon_item4_notification;
            public static int dialog_text_item4_notification = R.id.dialog_text_item4_notification;
            public static int dialog_root_item5_notification = R.id.dialog_root_item5_notification;
            public static int dialog_icon_item5_notification = R.id.dialog_icon_item5_notification;
            public static int dialog_text_item5_notification = R.id.dialog_text_item5_notification;
            public static int dialog_root_item6_notification = R.id.dialog_root_item6_notification;
            public static int dialog_icon_item6_notification = R.id.dialog_icon_item6_notification;
            public static int dialog_text_item6_notification = R.id.dialog_text_item6_notification;
            public static int dialog_root_item7_notification = R.id.dialog_root_item7_notification;
            public static int dialog_icon_item7_notification = R.id.dialog_icon_item7_notification;
            public static int dialog_text_item7_notification = R.id.dialog_text_item7_notification;
            public static int dialog_root_item8_notification = R.id.dialog_root_item8_notification;
            public static int dialog_icon_item8_notification = R.id.dialog_icon_item8_notification;
            public static int dialog_text_item8_notification = R.id.dialog_text_item8_notification;
        }
    }

    public static class ChatSubLayotUnreadMessage {
        public FrameLayout root;
        public TextView cslum_txt_unread_message;

        public ChatSubLayotUnreadMessage(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layot_unread_message );
        }

        public ChatSubLayotUnreadMessage(Context context,ViewGroup parent, int layout) {
            root = (FrameLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            cslum_txt_unread_message = (TextView) root.findViewById( R.id.cslum_txt_unread_message);
        }

        public ChatSubLayotUnreadMessage(Context context) {
            this(context ,null);
        }

        public ChatSubLayotUnreadMessage(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layot_unread_message;
            public static int cslum_txt_unread_message = R.id.cslum_txt_unread_message;
        }
    }

    public static class ChatSubLayout {
        public LinearLayout root;
        public LinearLayout root_chat_sub_layout;
        public MaterialDesignTextView cs_txt_contact_initials;
        public CircleImageView cs_img_contact_picture;
        public MaterialDesignTextView cs_txt_chat_icon;
        public EmojiTextViewE cs_txt_contact_name;
        public MaterialDesignTextView cs_txt_mute;
        public ImageView cslr_txt_tic;
        public TextView cs_txt_contact_time;
        public LinearLayout lyt_last_message_room;
        public EmojiTextViewE cs_txt_last_message_sender;
        public EmojiTextViewE cs_txt_last_message;
        public EmojiTextViewE cs_txt_last_message_file_text;
        public TextView cs_txt_unread_message;
        public MaterialDesignTextView cs_txt_pinned_message;

        public ChatSubLayout(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout );
        }

        public ChatSubLayout(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            root_chat_sub_layout = (LinearLayout) root.findViewById( R.id.root_chat_sub_layout);
            cs_txt_contact_initials = (MaterialDesignTextView) root.findViewById( R.id.cs_txt_contact_initials);
            cs_img_contact_picture = (CircleImageView) root.findViewById( R.id.cs_img_contact_picture);
            cs_txt_chat_icon = (MaterialDesignTextView) root.findViewById( R.id.cs_txt_chat_icon);
            cs_txt_contact_name = (EmojiTextViewE) root.findViewById( R.id.cs_txt_contact_name);
            cs_txt_mute = (MaterialDesignTextView) root.findViewById( R.id.cs_txt_mute);
            cslr_txt_tic = (ImageView) root.findViewById( R.id.cslr_txt_tic);
            cs_txt_contact_time = (TextView) root.findViewById( R.id.cs_txt_contact_time);
            lyt_last_message_room = (LinearLayout) root.findViewById( R.id.lyt_last_message_room);
            cs_txt_last_message_sender = (EmojiTextViewE) root.findViewById( R.id.cs_txt_last_message_sender);
            cs_txt_last_message = (EmojiTextViewE) root.findViewById( R.id.cs_txt_last_message);
            cs_txt_last_message_file_text = (EmojiTextViewE) root.findViewById( R.id.cs_txt_last_message_file_text);
            cs_txt_unread_message = (TextView) root.findViewById( R.id.cs_txt_unread_message);
            cs_txt_pinned_message = (MaterialDesignTextView) root.findViewById( R.id.cs_txt_pinned_message);
        }

        public ChatSubLayout(Context context) {
            this(context ,null);
        }

        public ChatSubLayout(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout;
            public static int root_chat_sub_layout = R.id.root_chat_sub_layout;
            public static int cs_txt_contact_initials = R.id.cs_txt_contact_initials;
            public static int cs_img_contact_picture = R.id.cs_img_contact_picture;
            public static int cs_txt_chat_icon = R.id.cs_txt_chat_icon;
            public static int cs_txt_contact_name = R.id.cs_txt_contact_name;
            public static int cs_txt_mute = R.id.cs_txt_mute;
            public static int cslr_txt_tic = R.id.cslr_txt_tic;
            public static int cs_txt_contact_time = R.id.cs_txt_contact_time;
            public static int lyt_last_message_room = R.id.lyt_last_message_room;
            public static int cs_txt_last_message_sender = R.id.cs_txt_last_message_sender;
            public static int cs_txt_last_message = R.id.cs_txt_last_message;
            public static int cs_txt_last_message_file_text = R.id.cs_txt_last_message_file_text;
            public static int cs_txt_unread_message = R.id.cs_txt_unread_message;
            public static int cs_txt_pinned_message = R.id.cs_txt_pinned_message;
        }
    }

    public static class ChatSubLayoutAudio {
        public FrameLayout root;
        public FrameLayout chatSubLayoutAudio;

        public ChatSubLayoutAudio(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout_audio );
        }

        public ChatSubLayoutAudio(Context context,ViewGroup parent, int layout) {
            root = (FrameLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            chatSubLayoutAudio = (FrameLayout) root.findViewById( R.id.chatSubLayoutAudio);
        }

        public ChatSubLayoutAudio(Context context) {
            this(context ,null);
        }

        public ChatSubLayoutAudio(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout_audio;
            public static int chatSubLayoutAudio = R.id.chatSubLayoutAudio;
        }
    }

    public static class ChatSubLayoutBlockUser {
        public RelativeLayout root;
        public TextView chat_txt_addContact;
        public MaterialDesignTextView chat_txt_close;

        public ChatSubLayoutBlockUser(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout_block_user );
        }

        public ChatSubLayoutBlockUser(Context context,ViewGroup parent, int layout) {
            root = (RelativeLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            chat_txt_addContact = (TextView) root.findViewById( R.id.chat_txt_addContact);
            chat_txt_close = (MaterialDesignTextView) root.findViewById( R.id.chat_txt_close);
        }

        public ChatSubLayoutBlockUser(Context context) {
            this(context ,null);
        }

        public ChatSubLayoutBlockUser(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout_block_user;
            public static int chat_txt_addContact = R.id.chat_txt_addContact;
            public static int chat_txt_close = R.id.chat_txt_close;
        }
    }

    public static class ChatSubLayoutCode {
        public LinearLayout root;
        public LinearLayout root_chat_sub_lyt;

        public ChatSubLayoutCode(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout_code );
        }

        public ChatSubLayoutCode(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            root_chat_sub_lyt = (LinearLayout) root.findViewById( R.id.root_chat_sub_lyt);
        }

        public ChatSubLayoutCode(Context context) {
            this(context ,null);
        }

        public ChatSubLayoutCode(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout_code;
            public static int root_chat_sub_lyt = R.id.root_chat_sub_lyt;
        }
    }

    public static class ChatSubLayoutContact {
        public FrameLayout root;
        public FrameLayout chatSubLayoutContact;

        public ChatSubLayoutContact(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout_contact );
        }

        public ChatSubLayoutContact(Context context,ViewGroup parent, int layout) {
            root = (FrameLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            chatSubLayoutContact = (FrameLayout) root.findViewById( R.id.chatSubLayoutContact);
        }

        public ChatSubLayoutContact(Context context) {
            this(context ,null);
        }

        public ChatSubLayoutContact(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout_contact;
            public static int chatSubLayoutContact = R.id.chatSubLayoutContact;
        }
    }

    public static class ChatSubLayoutFile {
        public FrameLayout root;
        public FrameLayout chatSubLayoutFile;
        public LinearLayout mainContainer;
        public LinearLayout contentContainer;
        public LinearLayout m_container;
        public ImageView thumbnail;
        public MessageProgress progress;
        public TextView songArtist;
        public TextView fileSize;
        public LinearLayout csliwt_layout_container_message;

        public ChatSubLayoutFile(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout_file );
        }

        public ChatSubLayoutFile(Context context,ViewGroup parent, int layout) {
            root = (FrameLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            chatSubLayoutFile = (FrameLayout) root.findViewById( R.id.chatSubLayoutFile);
            mainContainer = (LinearLayout) root.findViewById( R.id.mainContainer);
            contentContainer = (LinearLayout) root.findViewById( R.id.contentContainer);
            m_container = (LinearLayout) root.findViewById( R.id.m_container);
            thumbnail = (ImageView) root.findViewById( R.id.thumbnail);
            progress = (MessageProgress) root.findViewById( R.id.progress);
            songArtist = (TextView) root.findViewById( R.id.songArtist);
            fileSize = (TextView) root.findViewById( R.id.fileSize);
            csliwt_layout_container_message = (LinearLayout) root.findViewById( R.id.csliwt_layout_container_message);
        }

        public ChatSubLayoutFile(Context context) {
            this(context ,null);
        }

        public ChatSubLayoutFile(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout_file;
            public static int chatSubLayoutFile = R.id.chatSubLayoutFile;
            public static int mainContainer = R.id.mainContainer;
            public static int contentContainer = R.id.contentContainer;
            public static int m_container = R.id.m_container;
            public static int thumbnail = R.id.thumbnail;
            public static int progress = R.id.progress;
            public static int songArtist = R.id.songArtist;
            public static int fileSize = R.id.fileSize;
            public static int csliwt_layout_container_message = R.id.csliwt_layout_container_message;
        }
    }

    public static class ChatSubLayoutForward {
        public LinearLayout root;
        public LinearLayout cslr_ll_forward;
        public TextView cslr_txt_prefix_forward;
        public TextView cslr_txt_forward_from;

        public ChatSubLayoutForward(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout_forward );
        }

        public ChatSubLayoutForward(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            cslr_ll_forward = (LinearLayout) root.findViewById( R.id.cslr_ll_forward);
            cslr_txt_prefix_forward = (TextView) root.findViewById( R.id.cslr_txt_prefix_forward);
            cslr_txt_forward_from = (TextView) root.findViewById( R.id.cslr_txt_forward_from);
        }

        public ChatSubLayoutForward(Context context) {
            this(context ,null);
        }

        public ChatSubLayoutForward(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout_forward;
            public static int cslr_ll_forward = R.id.cslr_ll_forward;
            public static int cslr_txt_prefix_forward = R.id.cslr_txt_prefix_forward;
            public static int cslr_txt_forward_from = R.id.cslr_txt_forward_from;
        }
    }

    public static class ChatSubLayoutGif {
        public FrameLayout root;
        public FrameLayout chatSubLayoutGif;
        public LinearLayout mainContainer;
        public LinearLayout contentContainer;
        public LinearLayout m_container;
        public ReserveSpaceGifImageView thumbnail;
        public MessageProgress progress;

        public ChatSubLayoutGif(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout_gif );
        }

        public ChatSubLayoutGif(Context context,ViewGroup parent, int layout) {
            root = (FrameLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            chatSubLayoutGif = (FrameLayout) root.findViewById( R.id.chatSubLayoutGif);
            mainContainer = (LinearLayout) root.findViewById( R.id.mainContainer);
            contentContainer = (LinearLayout) root.findViewById( R.id.contentContainer);
            m_container = (LinearLayout) root.findViewById( R.id.m_container);
            thumbnail = (ReserveSpaceGifImageView) root.findViewById( R.id.thumbnail);
            progress = (MessageProgress) root.findViewById( R.id.progress);
        }

        public ChatSubLayoutGif(Context context) {
            this(context ,null);
        }

        public ChatSubLayoutGif(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout_gif;
            public static int chatSubLayoutGif = R.id.chatSubLayoutGif;
            public static int mainContainer = R.id.mainContainer;
            public static int contentContainer = R.id.contentContainer;
            public static int m_container = R.id.m_container;
            public static int thumbnail = R.id.thumbnail;
            public static int progress = R.id.progress;
        }
    }

    public static class ChatSubLayoutGifWithText {
        public FrameLayout root;
        public FrameLayout chatSubLayoutGifWithText;
        public LinearLayout mainContainer;
        public LinearLayout contentContainer;
        public LinearLayout m_container;
        public ReserveSpaceGifImageView thumbnail;
        public MessageProgress progress;
        public LinearLayout csliwt_layout_container_message;

        public ChatSubLayoutGifWithText(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout_gif_with_text );
        }

        public ChatSubLayoutGifWithText(Context context,ViewGroup parent, int layout) {
            root = (FrameLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            chatSubLayoutGifWithText = (FrameLayout) root.findViewById( R.id.chatSubLayoutGifWithText);
            mainContainer = (LinearLayout) root.findViewById( R.id.mainContainer);
            contentContainer = (LinearLayout) root.findViewById( R.id.contentContainer);
            m_container = (LinearLayout) root.findViewById( R.id.m_container);
            thumbnail = (ReserveSpaceGifImageView) root.findViewById( R.id.thumbnail);
            progress = (MessageProgress) root.findViewById( R.id.progress);
            csliwt_layout_container_message = (LinearLayout) root.findViewById( R.id.csliwt_layout_container_message);
        }

        public ChatSubLayoutGifWithText(Context context) {
            this(context ,null);
        }

        public ChatSubLayoutGifWithText(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout_gif_with_text;
            public static int chatSubLayoutGifWithText = R.id.chatSubLayoutGifWithText;
            public static int mainContainer = R.id.mainContainer;
            public static int contentContainer = R.id.contentContainer;
            public static int m_container = R.id.m_container;
            public static int thumbnail = R.id.thumbnail;
            public static int progress = R.id.progress;
            public static int csliwt_layout_container_message = R.id.csliwt_layout_container_message;
        }
    }

    public static class ChatSubLayoutHasForward {
        public LinearLayout root;
        public ImageView cslhs_imv_forward;
        public ImageView cslhf_imv_thumbnail;
        public EmojiTextViewE cslhf_txt_forward_from;
        public EmojiTextViewE cslhf_txt_message;
        public MaterialDesignTextView cslhf_imv_cansel;

        public ChatSubLayoutHasForward(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout_has_forward );
        }

        public ChatSubLayoutHasForward(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            cslhs_imv_forward = (ImageView) root.findViewById( R.id.cslhs_imv_forward);
            cslhf_imv_thumbnail = (ImageView) root.findViewById( R.id.cslhf_imv_thumbnail);
            cslhf_txt_forward_from = (EmojiTextViewE) root.findViewById( R.id.cslhf_txt_forward_from);
            cslhf_txt_message = (EmojiTextViewE) root.findViewById( R.id.cslhf_txt_message);
            cslhf_imv_cansel = (MaterialDesignTextView) root.findViewById( R.id.cslhf_imv_cansel);
        }

        public ChatSubLayoutHasForward(Context context) {
            this(context ,null);
        }

        public ChatSubLayoutHasForward(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout_has_forward;
            public static int cslhs_imv_forward = R.id.cslhs_imv_forward;
            public static int cslhf_imv_thumbnail = R.id.cslhf_imv_thumbnail;
            public static int cslhf_txt_forward_from = R.id.cslhf_txt_forward_from;
            public static int cslhf_txt_message = R.id.cslhf_txt_message;
            public static int cslhf_imv_cansel = R.id.cslhf_imv_cansel;
        }
    }

    public static class ChatSubLayoutImage {
        public FrameLayout root;
        public FrameLayout chatSubLayoutImage;
        public LinearLayout mainContainer;
        public LinearLayout contentContainer;
        public LinearLayout m_container;
        public ReserveSpaceRoundedImageView thumbnail;
        public MessageProgress progress;

        public ChatSubLayoutImage(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout_image );
        }

        public ChatSubLayoutImage(Context context,ViewGroup parent, int layout) {
            root = (FrameLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            chatSubLayoutImage = (FrameLayout) root.findViewById( R.id.chatSubLayoutImage);
            mainContainer = (LinearLayout) root.findViewById( R.id.mainContainer);
            contentContainer = (LinearLayout) root.findViewById( R.id.contentContainer);
            m_container = (LinearLayout) root.findViewById( R.id.m_container);
            thumbnail = (ReserveSpaceRoundedImageView) root.findViewById( R.id.thumbnail);
            progress = (MessageProgress) root.findViewById( R.id.progress);
        }

        public ChatSubLayoutImage(Context context) {
            this(context ,null);
        }

        public ChatSubLayoutImage(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout_image;
            public static int chatSubLayoutImage = R.id.chatSubLayoutImage;
            public static int mainContainer = R.id.mainContainer;
            public static int contentContainer = R.id.contentContainer;
            public static int m_container = R.id.m_container;
            public static int thumbnail = R.id.thumbnail;
            public static int progress = R.id.progress;
        }
    }

    public static class ChatSubLayoutImageWithText {
        public FrameLayout root;
        public FrameLayout chatSubLayoutImageWithText;
        public LinearLayout mainContainer;
        public LinearLayout contentContainer;
        public LinearLayout m_container;
        public ReserveSpaceRoundedImageView thumbnail;
        public MessageProgress progress;
        public LinearLayout csliwt_layout_container_message;

        public ChatSubLayoutImageWithText(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout_image_with_text );
        }

        public ChatSubLayoutImageWithText(Context context,ViewGroup parent, int layout) {
            root = (FrameLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            chatSubLayoutImageWithText = (FrameLayout) root.findViewById( R.id.chatSubLayoutImageWithText);
            mainContainer = (LinearLayout) root.findViewById( R.id.mainContainer);
            contentContainer = (LinearLayout) root.findViewById( R.id.contentContainer);
            m_container = (LinearLayout) root.findViewById( R.id.m_container);
            thumbnail = (ReserveSpaceRoundedImageView) root.findViewById( R.id.thumbnail);
            progress = (MessageProgress) root.findViewById( R.id.progress);
            csliwt_layout_container_message = (LinearLayout) root.findViewById( R.id.csliwt_layout_container_message);
        }

        public ChatSubLayoutImageWithText(Context context) {
            this(context ,null);
        }

        public ChatSubLayoutImageWithText(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout_image_with_text;
            public static int chatSubLayoutImageWithText = R.id.chatSubLayoutImageWithText;
            public static int mainContainer = R.id.mainContainer;
            public static int contentContainer = R.id.contentContainer;
            public static int m_container = R.id.m_container;
            public static int thumbnail = R.id.thumbnail;
            public static int progress = R.id.progress;
            public static int csliwt_layout_container_message = R.id.csliwt_layout_container_message;
        }
    }

    public static class ChatSubLayoutLocation {
        public FrameLayout root;
        public FrameLayout chatSubLayoutLocation;
        public LinearLayout mainContainer;
        public LinearLayout contentContainer;
        public LinearLayout m_container;
        public ReserveSpaceRoundedImageView thumbnail;

        public ChatSubLayoutLocation(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout_location );
        }

        public ChatSubLayoutLocation(Context context,ViewGroup parent, int layout) {
            root = (FrameLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            chatSubLayoutLocation = (FrameLayout) root.findViewById( R.id.chatSubLayoutLocation);
            mainContainer = (LinearLayout) root.findViewById( R.id.mainContainer);
            contentContainer = (LinearLayout) root.findViewById( R.id.contentContainer);
            m_container = (LinearLayout) root.findViewById( R.id.m_container);
            thumbnail = (ReserveSpaceRoundedImageView) root.findViewById( R.id.thumbnail);
        }

        public ChatSubLayoutLocation(Context context) {
            this(context ,null);
        }

        public ChatSubLayoutLocation(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout_location;
            public static int chatSubLayoutLocation = R.id.chatSubLayoutLocation;
            public static int mainContainer = R.id.mainContainer;
            public static int contentContainer = R.id.contentContainer;
            public static int m_container = R.id.m_container;
            public static int thumbnail = R.id.thumbnail;
        }
    }

    public static class ChatSubLayoutLog {
        public FrameLayout root;
        public FrameLayout chatSubLayoutLog;
        public TextView csll_txt_log_text;

        public ChatSubLayoutLog(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout_log );
        }

        public ChatSubLayoutLog(Context context,ViewGroup parent, int layout) {
            root = (FrameLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            chatSubLayoutLog = (FrameLayout) root.findViewById( R.id.chatSubLayoutLog);
            csll_txt_log_text = (TextView) root.findViewById( R.id.csll_txt_log_text);
        }

        public ChatSubLayoutLog(Context context) {
            this(context ,null);
        }

        public ChatSubLayoutLog(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout_log;
            public static int chatSubLayoutLog = R.id.chatSubLayoutLog;
            public static int csll_txt_log_text = R.id.csll_txt_log_text;
        }
    }

    public static class ChatSubLayoutMessage {
        public FrameLayout root;
        public FrameLayout chatSubLayoutMessage;

        public ChatSubLayoutMessage(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout_message );
        }

        public ChatSubLayoutMessage(Context context,ViewGroup parent, int layout) {
            root = (FrameLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            chatSubLayoutMessage = (FrameLayout) root.findViewById( R.id.chatSubLayoutMessage);
        }

        public ChatSubLayoutMessage(Context context) {
            this(context ,null);
        }

        public ChatSubLayoutMessage(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout_message;
            public static int chatSubLayoutMessage = R.id.chatSubLayoutMessage;
        }
    }

    public static class ChatSubLayoutMessagesTime {
        public LinearLayout root;
        public LinearLayout csl_ll_time;
        public View cslm_view_left_dis;
        public LinearLayout lyt_see;
        public LinearLayout lyt_signature;
        public TextView txt_signature;
        public TextView txt_views_label;
        public MaterialDesignTextView img_eye;
        public TextView txtEditedIndicator;
        public TextView cslr_txt_time;
        public ImageView cslr_txt_tic;
        public MaterialDesignTextView cslr_txt_hearing;
        public LinearLayout lyt_right;

        public ChatSubLayoutMessagesTime(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout_messages_time );
        }

        public ChatSubLayoutMessagesTime(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            csl_ll_time = (LinearLayout) root.findViewById( R.id.csl_ll_time);
            cslm_view_left_dis = (View) root.findViewById( R.id.cslm_view_left_dis);
            lyt_see = (LinearLayout) root.findViewById( R.id.lyt_see);
            lyt_signature = (LinearLayout) root.findViewById( R.id.lyt_signature);
            txt_signature = (TextView) root.findViewById( R.id.txt_signature);
            txt_views_label = (TextView) root.findViewById( R.id.txt_views_label);
            img_eye = (MaterialDesignTextView) root.findViewById( R.id.img_eye);
            txtEditedIndicator = (TextView) root.findViewById( R.id.txtEditedIndicator);
            cslr_txt_time = (TextView) root.findViewById( R.id.cslr_txt_time);
            cslr_txt_tic = (ImageView) root.findViewById( R.id.cslr_txt_tic);
            cslr_txt_hearing = (MaterialDesignTextView) root.findViewById( R.id.cslr_txt_hearing);
            lyt_right = (LinearLayout) root.findViewById( R.id.lyt_right);
        }

        public ChatSubLayoutMessagesTime(Context context) {
            this(context ,null);
        }

        public ChatSubLayoutMessagesTime(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout_messages_time;
            public static int csl_ll_time = R.id.csl_ll_time;
            public static int cslm_view_left_dis = R.id.cslm_view_left_dis;
            public static int lyt_see = R.id.lyt_see;
            public static int lyt_signature = R.id.lyt_signature;
            public static int txt_signature = R.id.txt_signature;
            public static int txt_views_label = R.id.txt_views_label;
            public static int img_eye = R.id.img_eye;
            public static int txtEditedIndicator = R.id.txtEditedIndicator;
            public static int cslr_txt_time = R.id.cslr_txt_time;
            public static int cslr_txt_tic = R.id.cslr_txt_tic;
            public static int cslr_txt_hearing = R.id.cslr_txt_hearing;
            public static int lyt_right = R.id.lyt_right;
        }
    }

    public static class ChatSubLayoutMessagesVote {
        public LinearLayout root;
        public LinearLayout lyt_vote;
        public MaterialDesignTextView img_vote_forward;
        public LinearLayout lyt_vote_up;
        public TextView txt_vote_up;
        public MaterialDesignTextView img_vote_up;
        public LinearLayout lyt_vote_down;
        public MaterialDesignTextView img_vote_down;
        public TextView txt_vote_down;

        public ChatSubLayoutMessagesVote(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout_messages_vote );
        }

        public ChatSubLayoutMessagesVote(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            lyt_vote = (LinearLayout) root.findViewById( R.id.lyt_vote);
            img_vote_forward = (MaterialDesignTextView) root.findViewById( R.id.img_vote_forward);
            lyt_vote_up = (LinearLayout) root.findViewById( R.id.lyt_vote_up);
            txt_vote_up = (TextView) root.findViewById( R.id.txt_vote_up);
            img_vote_up = (MaterialDesignTextView) root.findViewById( R.id.img_vote_up);
            lyt_vote_down = (LinearLayout) root.findViewById( R.id.lyt_vote_down);
            img_vote_down = (MaterialDesignTextView) root.findViewById( R.id.img_vote_down);
            txt_vote_down = (TextView) root.findViewById( R.id.txt_vote_down);
        }

        public ChatSubLayoutMessagesVote(Context context) {
            this(context ,null);
        }

        public ChatSubLayoutMessagesVote(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout_messages_vote;
            public static int lyt_vote = R.id.lyt_vote;
            public static int img_vote_forward = R.id.img_vote_forward;
            public static int lyt_vote_up = R.id.lyt_vote_up;
            public static int txt_vote_up = R.id.txt_vote_up;
            public static int img_vote_up = R.id.img_vote_up;
            public static int lyt_vote_down = R.id.lyt_vote_down;
            public static int img_vote_down = R.id.img_vote_down;
            public static int txt_vote_down = R.id.txt_vote_down;
        }
    }

    public static class ChatSubLayoutProgress {
        public FrameLayout root;
        public ProgressBar cslp_progress_bar_waiting;

        public ChatSubLayoutProgress(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout_progress );
        }

        public ChatSubLayoutProgress(Context context,ViewGroup parent, int layout) {
            root = (FrameLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            cslp_progress_bar_waiting = (ProgressBar) root.findViewById( R.id.cslp_progress_bar_waiting);
        }

        public ChatSubLayoutProgress(Context context) {
            this(context ,null);
        }

        public ChatSubLayoutProgress(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout_progress;
            public static int cslp_progress_bar_waiting = R.id.cslp_progress_bar_waiting;
        }
    }

    public static class ChatSubLayoutReply {
        public LinearLayout root;
        public LinearLayout cslr_replay_layout;
        public View verticalLine;
        public ImageView chslr_imv_replay_pic;
        public EmojiTextViewE chslr_txt_replay_from;
        public EmojiTextViewE chslr_txt_replay_message;

        public ChatSubLayoutReply(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout_reply );
        }

        public ChatSubLayoutReply(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            cslr_replay_layout = (LinearLayout) root.findViewById( R.id.cslr_replay_layout);
            verticalLine = (View) root.findViewById( R.id.verticalLine);
            chslr_imv_replay_pic = (ImageView) root.findViewById( R.id.chslr_imv_replay_pic);
            chslr_txt_replay_from = (EmojiTextViewE) root.findViewById( R.id.chslr_txt_replay_from);
            chslr_txt_replay_message = (EmojiTextViewE) root.findViewById( R.id.chslr_txt_replay_message);
        }

        public ChatSubLayoutReply(Context context) {
            this(context ,null);
        }

        public ChatSubLayoutReply(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout_reply;
            public static int cslr_replay_layout = R.id.cslr_replay_layout;
            public static int verticalLine = R.id.verticalLine;
            public static int chslr_imv_replay_pic = R.id.chslr_imv_replay_pic;
            public static int chslr_txt_replay_from = R.id.chslr_txt_replay_from;
            public static int chslr_txt_replay_message = R.id.chslr_txt_replay_message;
        }
    }

    public static class ChatSubLayoutSelectChat {
        public LinearLayout root;
        public CircleImageView cs_img_contact_picture;
        public View cs_view_distance_color;
        public TextView cs_txt_contact_icon;
        public EmojiTextViewE cs_txt_contact_name;
        public EmojiTextViewE cs_txt_last_message_sender;
        public EmojiTextViewE cs_txt_last_message;
        public MaterialDesignTextView cs_txt_mute;
        public ImageView cslr_txt_tic;
        public TextView cs_txt_contact_time;
        public TextView cs_txt_unread_message;

        public ChatSubLayoutSelectChat(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout_select_chat );
        }

        public ChatSubLayoutSelectChat(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            cs_img_contact_picture = (CircleImageView) root.findViewById( R.id.cs_img_contact_picture);
            cs_view_distance_color = (View) root.findViewById( R.id.cs_view_distance_color);
            cs_txt_contact_icon = (TextView) root.findViewById( R.id.cs_txt_contact_icon);
            cs_txt_contact_name = (EmojiTextViewE) root.findViewById( R.id.cs_txt_contact_name);
            cs_txt_last_message_sender = (EmojiTextViewE) root.findViewById( R.id.cs_txt_last_message_sender);
            cs_txt_last_message = (EmojiTextViewE) root.findViewById( R.id.cs_txt_last_message);
            cs_txt_mute = (MaterialDesignTextView) root.findViewById( R.id.cs_txt_mute);
            cslr_txt_tic = (ImageView) root.findViewById( R.id.cslr_txt_tic);
            cs_txt_contact_time = (TextView) root.findViewById( R.id.cs_txt_contact_time);
            cs_txt_unread_message = (TextView) root.findViewById( R.id.cs_txt_unread_message);
        }

        public ChatSubLayoutSelectChat(Context context) {
            this(context ,null);
        }

        public ChatSubLayoutSelectChat(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout_select_chat;
            public static int cs_img_contact_picture = R.id.cs_img_contact_picture;
            public static int cs_view_distance_color = R.id.cs_view_distance_color;
            public static int cs_txt_contact_icon = R.id.cs_txt_contact_icon;
            public static int cs_txt_contact_name = R.id.cs_txt_contact_name;
            public static int cs_txt_last_message_sender = R.id.cs_txt_last_message_sender;
            public static int cs_txt_last_message = R.id.cs_txt_last_message;
            public static int cs_txt_mute = R.id.cs_txt_mute;
            public static int cslr_txt_tic = R.id.cslr_txt_tic;
            public static int cs_txt_contact_time = R.id.cs_txt_contact_time;
            public static int cs_txt_unread_message = R.id.cs_txt_unread_message;
        }
    }

    public static class ChatSubLayoutStripCall {
        public LinearLayout root;
        public TextView cslcs_btn_call_strip;
        public TextView cslcs_txt_timer;

        public ChatSubLayoutStripCall(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout_strip_call );
        }

        public ChatSubLayoutStripCall(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            cslcs_btn_call_strip = (TextView) root.findViewById( R.id.cslcs_btn_call_strip);
            cslcs_txt_timer = (TextView) root.findViewById( R.id.cslcs_txt_timer);
        }

        public ChatSubLayoutStripCall(Context context) {
            this(context ,null);
        }

        public ChatSubLayoutStripCall(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout_strip_call;
            public static int cslcs_btn_call_strip = R.id.cslcs_btn_call_strip;
            public static int cslcs_txt_timer = R.id.cslcs_txt_timer;
        }
    }

    public static class ChatSubLayoutTime {
        public FrameLayout root;
        public FrameLayout chatSubLayoutTime;
        public TextView cslt_txt_time_date;

        public ChatSubLayoutTime(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout_time );
        }

        public ChatSubLayoutTime(Context context,ViewGroup parent, int layout) {
            root = (FrameLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            chatSubLayoutTime = (FrameLayout) root.findViewById( R.id.chatSubLayoutTime);
            cslt_txt_time_date = (TextView) root.findViewById( R.id.cslt_txt_time_date);
        }

        public ChatSubLayoutTime(Context context) {
            this(context ,null);
        }

        public ChatSubLayoutTime(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout_time;
            public static int chatSubLayoutTime = R.id.chatSubLayoutTime;
            public static int cslt_txt_time_date = R.id.cslt_txt_time_date;
        }
    }

    public static class ChatSubLayoutVideo {
        public FrameLayout root;
        public FrameLayout chatSubLayoutVideo;
        public LinearLayout mainContainer;
        public LinearLayout contentContainer;
        public LinearLayout m_container;
        public ReserveSpaceRoundedImageView thumbnail;
        public TextView duration;
        public MessageProgress progress;

        public ChatSubLayoutVideo(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout_video );
        }

        public ChatSubLayoutVideo(Context context,ViewGroup parent, int layout) {
            root = (FrameLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            chatSubLayoutVideo = (FrameLayout) root.findViewById( R.id.chatSubLayoutVideo);
            mainContainer = (LinearLayout) root.findViewById( R.id.mainContainer);
            contentContainer = (LinearLayout) root.findViewById( R.id.contentContainer);
            m_container = (LinearLayout) root.findViewById( R.id.m_container);
            thumbnail = (ReserveSpaceRoundedImageView) root.findViewById( R.id.thumbnail);
            duration = (TextView) root.findViewById( R.id.duration);
            progress = (MessageProgress) root.findViewById( R.id.progress);
        }

        public ChatSubLayoutVideo(Context context) {
            this(context ,null);
        }

        public ChatSubLayoutVideo(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout_video;
            public static int chatSubLayoutVideo = R.id.chatSubLayoutVideo;
            public static int mainContainer = R.id.mainContainer;
            public static int contentContainer = R.id.contentContainer;
            public static int m_container = R.id.m_container;
            public static int thumbnail = R.id.thumbnail;
            public static int duration = R.id.duration;
            public static int progress = R.id.progress;
        }
    }

    public static class ChatSubLayoutVideoWithText {
        public FrameLayout root;
        public FrameLayout chatSubLayoutVideoWithText;
        public LinearLayout mainContainer;
        public LinearLayout contentContainer;
        public LinearLayout m_container;
        public ReserveSpaceRoundedImageView thumbnail;
        public TextView duration;
        public MessageProgress progress;
        public LinearLayout csliwt_layout_container_message;

        public ChatSubLayoutVideoWithText(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout_video_with_text );
        }

        public ChatSubLayoutVideoWithText(Context context,ViewGroup parent, int layout) {
            root = (FrameLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            chatSubLayoutVideoWithText = (FrameLayout) root.findViewById( R.id.chatSubLayoutVideoWithText);
            mainContainer = (LinearLayout) root.findViewById( R.id.mainContainer);
            contentContainer = (LinearLayout) root.findViewById( R.id.contentContainer);
            m_container = (LinearLayout) root.findViewById( R.id.m_container);
            thumbnail = (ReserveSpaceRoundedImageView) root.findViewById( R.id.thumbnail);
            duration = (TextView) root.findViewById( R.id.duration);
            progress = (MessageProgress) root.findViewById( R.id.progress);
            csliwt_layout_container_message = (LinearLayout) root.findViewById( R.id.csliwt_layout_container_message);
        }

        public ChatSubLayoutVideoWithText(Context context) {
            this(context ,null);
        }

        public ChatSubLayoutVideoWithText(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout_video_with_text;
            public static int chatSubLayoutVideoWithText = R.id.chatSubLayoutVideoWithText;
            public static int mainContainer = R.id.mainContainer;
            public static int contentContainer = R.id.contentContainer;
            public static int m_container = R.id.m_container;
            public static int thumbnail = R.id.thumbnail;
            public static int duration = R.id.duration;
            public static int progress = R.id.progress;
            public static int csliwt_layout_container_message = R.id.csliwt_layout_container_message;
        }
    }

    public static class ChatSubLayoutVoice {
        public FrameLayout root;
        public FrameLayout chatSubLayoutVoice;
        public LinearLayout mainContainer;
        public LinearLayout contentContainer;
        public LinearLayout m_container;
        public LinearLayout audioPlayerViewContainer;
        public ImageView thumbnail;
        public MessageProgress progress;
        public TextView cslv_txt_author;
        public TextView csla_btn_play_music;
        public SeekBar csla_seekBar1;
        public TextView csla_txt_timer;

        public ChatSubLayoutVoice(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout_voice );
        }

        public ChatSubLayoutVoice(Context context,ViewGroup parent, int layout) {
            root = (FrameLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            chatSubLayoutVoice = (FrameLayout) root.findViewById( R.id.chatSubLayoutVoice);
            mainContainer = (LinearLayout) root.findViewById( R.id.mainContainer);
            contentContainer = (LinearLayout) root.findViewById( R.id.contentContainer);
            m_container = (LinearLayout) root.findViewById( R.id.m_container);
            audioPlayerViewContainer = (LinearLayout) root.findViewById( R.id.audioPlayerViewContainer);
            thumbnail = (ImageView) root.findViewById( R.id.thumbnail);
            progress = (MessageProgress) root.findViewById( R.id.progress);
            cslv_txt_author = (TextView) root.findViewById( R.id.cslv_txt_author);
            csla_btn_play_music = (TextView) root.findViewById( R.id.csla_btn_play_music);
            csla_seekBar1 = (SeekBar) root.findViewById( R.id.csla_seekBar1);
            csla_txt_timer = (TextView) root.findViewById( R.id.csla_txt_timer);
        }

        public ChatSubLayoutVoice(Context context) {
            this(context ,null);
        }

        public ChatSubLayoutVoice(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout_voice;
            public static int chatSubLayoutVoice = R.id.chatSubLayoutVoice;
            public static int mainContainer = R.id.mainContainer;
            public static int contentContainer = R.id.contentContainer;
            public static int m_container = R.id.m_container;
            public static int audioPlayerViewContainer = R.id.audioPlayerViewContainer;
            public static int thumbnail = R.id.thumbnail;
            public static int progress = R.id.progress;
            public static int cslv_txt_author = R.id.cslv_txt_author;
            public static int csla_btn_play_music = R.id.csla_btn_play_music;
            public static int csla_seekBar1 = R.id.csla_seekBar1;
            public static int csla_txt_timer = R.id.csla_txt_timer;
        }
    }

    public static class ChatSubLayoutVoteContainer {
        public LinearLayout root;
        public LinearLayout vote_container;

        public ChatSubLayoutVoteContainer(Context context,ViewGroup parent) {
            this(context,parent, R.layout.chat_sub_layout_vote_container );
        }

        public ChatSubLayoutVoteContainer(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            vote_container = (LinearLayout) root.findViewById( R.id.vote_container);
        }

        public ChatSubLayoutVoteContainer(Context context) {
            this(context ,null);
        }

        public ChatSubLayoutVoteContainer(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.chat_sub_layout_vote_container;
            public static int vote_container = R.id.vote_container;
        }
    }

    public static class CommentSubLayout {
        public LinearLayout root;
        public LinearLayout csl_ll_comment;
        public CircleImageView csl_img_comment_sender_picture;
        public TextView csl_txt_message;
        public TextView csl_txt_date;
        public TextView csl_txt_clock;
        public LinearLayout csl_ll_replay_comment;
        public LinearLayout csl_ll_add_replay;

        public CommentSubLayout(Context context,ViewGroup parent) {
            this(context,parent, R.layout.comment_sub_layout );
        }

        public CommentSubLayout(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            csl_ll_comment = (LinearLayout) root.findViewById( R.id.csl_ll_comment);
            csl_img_comment_sender_picture = (CircleImageView) root.findViewById( R.id.csl_img_comment_sender_picture);
            csl_txt_message = (TextView) root.findViewById( R.id.csl_txt_message);
            csl_txt_date = (TextView) root.findViewById( R.id.csl_txt_date);
            csl_txt_clock = (TextView) root.findViewById( R.id.csl_txt_clock);
            csl_ll_replay_comment = (LinearLayout) root.findViewById( R.id.csl_ll_replay_comment);
            csl_ll_add_replay = (LinearLayout) root.findViewById( R.id.csl_ll_add_replay);
        }

        public CommentSubLayout(Context context) {
            this(context ,null);
        }

        public CommentSubLayout(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.comment_sub_layout;
            public static int csl_ll_comment = R.id.csl_ll_comment;
            public static int csl_img_comment_sender_picture = R.id.csl_img_comment_sender_picture;
            public static int csl_txt_message = R.id.csl_txt_message;
            public static int csl_txt_date = R.id.csl_txt_date;
            public static int csl_txt_clock = R.id.csl_txt_clock;
            public static int csl_ll_replay_comment = R.id.csl_ll_replay_comment;
            public static int csl_ll_add_replay = R.id.csl_ll_add_replay;
        }
    }

    public static class CommentSubLayoutMore {
        public LinearLayout root;

        public CommentSubLayoutMore(Context context,ViewGroup parent) {
            this(context,parent, R.layout.comment_sub_layout_more );
        }

        public CommentSubLayoutMore(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
        }

        public CommentSubLayoutMore(Context context) {
            this(context ,null);
        }

        public CommentSubLayoutMore(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.comment_sub_layout_more;
        }
    }

    public static class ContactHeaderItem {
        public CustomTextViewMedium root;

        public ContactHeaderItem(Context context,ViewGroup parent) {
            this(context,parent, R.layout.contact_header_item );
        }

        public ContactHeaderItem(Context context,ViewGroup parent, int layout) {
            root = (CustomTextViewMedium) LayoutInflater.from(context).inflate(layout,parent ,false);
        }

        public ContactHeaderItem(Context context) {
            this(context ,null);
        }

        public ContactHeaderItem(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.contact_header_item;
        }
    }

    public static class ContactItem {
        public LinearLayout root;
        public View topLine;
        public SwipeLayout swipeRevealLayout;
        public LinearLayout bottom_wrapper;
        public CircleImageView imageView;
        public CustomTextViewMedium title;
        public CustomTextViewMedium subtitle;
        public View bottomLine;

        public ContactItem(Context context,ViewGroup parent) {
            this(context,parent, R.layout.contact_item );
        }

        public ContactItem(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            topLine = (View) root.findViewById( R.id.topLine);
            swipeRevealLayout = (SwipeLayout) root.findViewById( R.id.swipeRevealLayout);
            bottom_wrapper = (LinearLayout) root.findViewById( R.id.bottom_wrapper);
            imageView = (CircleImageView) root.findViewById( R.id.imageView);
            title = (CustomTextViewMedium) root.findViewById( R.id.title);
            subtitle = (CustomTextViewMedium) root.findViewById( R.id.subtitle);
            bottomLine = (View) root.findViewById( R.id.bottomLine);
        }

        public ContactItem(Context context) {
            this(context ,null);
        }

        public ContactItem(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.contact_item;
            public static int topLine = R.id.topLine;
            public static int swipeRevealLayout = R.id.swipeRevealLayout;
            public static int bottom_wrapper = R.id.bottom_wrapper;
            public static int imageView = R.id.imageView;
            public static int title = R.id.title;
            public static int subtitle = R.id.subtitle;
            public static int bottomLine = R.id.bottomLine;
        }
    }

    public static class ContactItemCode {
        public LinearLayout root;
        public LinearLayout contactItem;

        public ContactItemCode(Context context,ViewGroup parent) {
            this(context,parent, R.layout.contact_item_code );
        }

        public ContactItemCode(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            contactItem = (LinearLayout) root.findViewById( R.id.contactItem);
        }

        public ContactItemCode(Context context) {
            this(context ,null);
        }

        public ContactItemCode(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.contact_item_code;
            public static int contactItem = R.id.contactItem;
        }
    }

    public static class ContactItemGroup {
        public LinearLayout root;
        public View topLine;
        public AnimateCheckBox cig_checkBox_select_user;
        public CircleImageView imageView;
        public CustomTextViewMedium title;
        public CustomTextViewMedium subtitle;

        public ContactItemGroup(Context context,ViewGroup parent) {
            this(context,parent, R.layout.contact_item_group );
        }

        public ContactItemGroup(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            topLine = (View) root.findViewById( R.id.topLine);
            cig_checkBox_select_user = (AnimateCheckBox) root.findViewById( R.id.cig_checkBox_select_user);
            imageView = (CircleImageView) root.findViewById( R.id.imageView);
            title = (CustomTextViewMedium) root.findViewById( R.id.title);
            subtitle = (CustomTextViewMedium) root.findViewById( R.id.subtitle);
        }

        public ContactItemGroup(Context context) {
            this(context ,null);
        }

        public ContactItemGroup(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.contact_item_group;
            public static int topLine = R.id.topLine;
            public static int cig_checkBox_select_user = R.id.cig_checkBox_select_user;
            public static int imageView = R.id.imageView;
            public static int title = R.id.title;
            public static int subtitle = R.id.subtitle;
        }
    }

    public static class ContactItemGroupProfile {
        public LinearLayout root;
        public View cigp_view_topLine;
        public CircleImageView cigp_imv_contact_avatar;
        public MaterialDesignTextView cigp_txt_member_role;
        public CustomTextViewMedium cigp_txt_contact_name;
        public CustomTextViewMedium cigp_txt_contact_lastseen;
        public MaterialDesignTextView cigp_moreButton;
        public TextView cigp_txt_nomber_of_shared_media;

        public ContactItemGroupProfile(Context context,ViewGroup parent) {
            this(context,parent, R.layout.contact_item_group_profile );
        }

        public ContactItemGroupProfile(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            cigp_view_topLine = (View) root.findViewById( R.id.cigp_view_topLine);
            cigp_imv_contact_avatar = (CircleImageView) root.findViewById( R.id.cigp_imv_contact_avatar);
            cigp_txt_member_role = (MaterialDesignTextView) root.findViewById( R.id.cigp_txt_member_role);
            cigp_txt_contact_name = (CustomTextViewMedium) root.findViewById( R.id.cigp_txt_contact_name);
            cigp_txt_contact_lastseen = (CustomTextViewMedium) root.findViewById( R.id.cigp_txt_contact_lastseen);
            cigp_moreButton = (MaterialDesignTextView) root.findViewById( R.id.cigp_moreButton);
            cigp_txt_nomber_of_shared_media = (TextView) root.findViewById( R.id.cigp_txt_nomber_of_shared_media);
        }

        public ContactItemGroupProfile(Context context) {
            this(context ,null);
        }

        public ContactItemGroupProfile(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.contact_item_group_profile;
            public static int cigp_view_topLine = R.id.cigp_view_topLine;
            public static int cigp_imv_contact_avatar = R.id.cigp_imv_contact_avatar;
            public static int cigp_txt_member_role = R.id.cigp_txt_member_role;
            public static int cigp_txt_contact_name = R.id.cigp_txt_contact_name;
            public static int cigp_txt_contact_lastseen = R.id.cigp_txt_contact_lastseen;
            public static int cigp_moreButton = R.id.cigp_moreButton;
            public static int cigp_txt_nomber_of_shared_media = R.id.cigp_txt_nomber_of_shared_media;
        }
    }

    public static class ContactItemNotRegister {
        public LinearLayout root;
        public View topLine;
        public CircleImageView imageView;
        public CustomTextViewMedium title;
        public CustomTextViewMedium subtitle;

        public ContactItemNotRegister(Context context,ViewGroup parent) {
            this(context,parent, R.layout.contact_item_not_register );
        }

        public ContactItemNotRegister(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            topLine = (View) root.findViewById( R.id.topLine);
            imageView = (CircleImageView) root.findViewById( R.id.imageView);
            title = (CustomTextViewMedium) root.findViewById( R.id.title);
            subtitle = (CustomTextViewMedium) root.findViewById( R.id.subtitle);
        }

        public ContactItemNotRegister(Context context) {
            this(context ,null);
        }

        public ContactItemNotRegister(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.contact_item_not_register;
            public static int topLine = R.id.topLine;
            public static int imageView = R.id.imageView;
            public static int title = R.id.title;
            public static int subtitle = R.id.subtitle;
        }
    }

    public static class DialogAlertJoin {
        public LinearLayout root;
        public CircleImageView daj_img_room_picture;
        public TextView daj_txt_room_name;
        public TextView daj_txt_member_count;

        public DialogAlertJoin(Context context,ViewGroup parent) {
            this(context,parent, R.layout.dialog_alert_join );
        }

        public DialogAlertJoin(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            daj_img_room_picture = (CircleImageView) root.findViewById( R.id.daj_img_room_picture);
            daj_txt_room_name = (TextView) root.findViewById( R.id.daj_txt_room_name);
            daj_txt_member_count = (TextView) root.findViewById( R.id.daj_txt_member_count);
        }

        public DialogAlertJoin(Context context) {
            this(context ,null);
        }

        public DialogAlertJoin(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.dialog_alert_join;
            public static int daj_img_room_picture = R.id.daj_img_room_picture;
            public static int daj_txt_room_name = R.id.daj_txt_room_name;
            public static int daj_txt_member_count = R.id.daj_txt_member_count;
        }
    }

    public static class DialogAutoLock {
        public LinearLayout root;
        public NumberPicker numberPicker;

        public DialogAutoLock(Context context,ViewGroup parent) {
            this(context,parent, R.layout.dialog_auto_lock );
        }

        public DialogAutoLock(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            numberPicker = (NumberPicker) root.findViewById( R.id.numberPicker);
        }

        public DialogAutoLock(Context context) {
            this(context ,null);
        }

        public DialogAutoLock(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.dialog_auto_lock;
            public static int numberPicker = R.id.numberPicker;
        }
    }

    public static class DialogBrushPaint {
        public LinearLayout root;
        public TextView textView_brush_size;
        public SeekBar seekBar_brush_size;

        public DialogBrushPaint(Context context,ViewGroup parent) {
            this(context,parent, R.layout.dialog_brush_paint );
        }

        public DialogBrushPaint(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            textView_brush_size = (TextView) root.findViewById( R.id.textView_brush_size);
            seekBar_brush_size = (SeekBar) root.findViewById( R.id.seekBar_brush_size);
        }

        public DialogBrushPaint(Context context) {
            this(context ,null);
        }

        public DialogBrushPaint(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.dialog_brush_paint;
            public static int textView_brush_size = R.id.textView_brush_size;
            public static int seekBar_brush_size = R.id.seekBar_brush_size;
        }
    }

    public static class DialogContentCustom {
        public LinearLayout root;
        public LinearLayout dialog_root_item1_notification;
        public MaterialDesignTextView iconDialogTitle;
        public TextView txtDialogTitle;
        public TextView txtDialogContent;
        public TextView txtDialogCancel;
        public TextView txtDialogOk;

        public DialogContentCustom(Context context,ViewGroup parent) {
            this(context,parent, R.layout.dialog_content_custom );
        }

        public DialogContentCustom(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            dialog_root_item1_notification = (LinearLayout) root.findViewById( R.id.dialog_root_item1_notification);
            iconDialogTitle = (MaterialDesignTextView) root.findViewById( R.id.iconDialogTitle);
            txtDialogTitle = (TextView) root.findViewById( R.id.txtDialogTitle);
            txtDialogContent = (TextView) root.findViewById( R.id.txtDialogContent);
            txtDialogCancel = (TextView) root.findViewById( R.id.txtDialogCancel);
            txtDialogOk = (TextView) root.findViewById( R.id.txtDialogOk);
        }

        public DialogContentCustom(Context context) {
            this(context ,null);
        }

        public DialogContentCustom(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.dialog_content_custom;
            public static int dialog_root_item1_notification = R.id.dialog_root_item1_notification;
            public static int iconDialogTitle = R.id.iconDialogTitle;
            public static int txtDialogTitle = R.id.txtDialogTitle;
            public static int txtDialogContent = R.id.txtDialogContent;
            public static int txtDialogCancel = R.id.txtDialogCancel;
            public static int txtDialogOk = R.id.txtDialogOk;
        }
    }

    public static class DialogFingerPrint {
        public LinearLayout root;
        public LinearLayout dialog_root_item1_notification;
        public MaterialDesignTextView iconDialogTitle;
        public TextView txtDialogTitle;

        public DialogFingerPrint(Context context,ViewGroup parent) {
            this(context,parent, R.layout.dialog_finger_print );
        }

        public DialogFingerPrint(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            dialog_root_item1_notification = (LinearLayout) root.findViewById( R.id.dialog_root_item1_notification);
            iconDialogTitle = (MaterialDesignTextView) root.findViewById( R.id.iconDialogTitle);
            txtDialogTitle = (TextView) root.findViewById( R.id.txtDialogTitle);
        }

        public DialogFingerPrint(Context context) {
            this(context ,null);
        }

        public DialogFingerPrint(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.dialog_finger_print;
            public static int dialog_root_item1_notification = R.id.dialog_root_item1_notification;
            public static int iconDialogTitle = R.id.iconDialogTitle;
            public static int txtDialogTitle = R.id.txtDialogTitle;
        }
    }

    public static class DialogMapRegistration {
        public LinearLayout root;
        public TextView txtIconTurnOnOrOff;
        public TextView txtMapRegister;
        public ToggleButton btnMapChangeRegistration;

        public DialogMapRegistration(Context context,ViewGroup parent) {
            this(context,parent, R.layout.dialog_map_registration );
        }

        public DialogMapRegistration(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            txtIconTurnOnOrOff = (TextView) root.findViewById( R.id.txtIconTurnOnOrOff);
            txtMapRegister = (TextView) root.findViewById( R.id.txtMapRegister);
            btnMapChangeRegistration = (ToggleButton) root.findViewById( R.id.btnMapChangeRegistration);
        }

        public DialogMapRegistration(Context context) {
            this(context ,null);
        }

        public DialogMapRegistration(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.dialog_map_registration;
            public static int txtIconTurnOnOrOff = R.id.txtIconTurnOnOrOff;
            public static int txtMapRegister = R.id.txtMapRegister;
            public static int btnMapChangeRegistration = R.id.btnMapChangeRegistration;
        }
    }

    public static class DialogNotification {
        public LinearLayout root;
        public TextView md_txt_message;
        public Button md_btn_no;
        public Button md_btn_yes;

        public DialogNotification(Context context,ViewGroup parent) {
            this(context,parent, R.layout.dialog_notification );
        }

        public DialogNotification(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            md_txt_message = (TextView) root.findViewById( R.id.md_txt_message);
            md_btn_no = (Button) root.findViewById( R.id.md_btn_no);
            md_btn_yes = (Button) root.findViewById( R.id.md_btn_yes);
        }

        public DialogNotification(Context context) {
            this(context ,null);
        }

        public DialogNotification(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.dialog_notification;
            public static int md_txt_message = R.id.md_txt_message;
            public static int md_btn_no = R.id.md_btn_no;
            public static int md_btn_yes = R.id.md_btn_yes;
        }
    }

    public static class DialogNumberPicker {
        public LinearLayout root;
        public NumberPicker dialog_np_times;
        public NumberPicker dialog_np_minutes;

        public DialogNumberPicker(Context context,ViewGroup parent) {
            this(context,parent, R.layout.dialog_number_picker );
        }

        public DialogNumberPicker(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            dialog_np_times = (NumberPicker) root.findViewById( R.id.dialog_np_times);
            dialog_np_minutes = (NumberPicker) root.findViewById( R.id.dialog_np_minutes);
        }

        public DialogNumberPicker(Context context) {
            this(context ,null);
        }

        public DialogNumberPicker(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.dialog_number_picker;
            public static int dialog_np_times = R.id.dialog_np_times;
            public static int dialog_np_minutes = R.id.dialog_np_minutes;
        }
    }

    public static class DialogQrcode {
        public FrameLayout root;
        public ImageView imgQrCodeNewDevice;
        public ProgressBar prgWaitQrCode;

        public DialogQrcode(Context context,ViewGroup parent) {
            this(context,parent, R.layout.dialog_qrcode );
        }

        public DialogQrcode(Context context,ViewGroup parent, int layout) {
            root = (FrameLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            imgQrCodeNewDevice = (ImageView) root.findViewById( R.id.imgQrCodeNewDevice);
            prgWaitQrCode = (ProgressBar) root.findViewById( R.id.prgWaitQrCode);
        }

        public DialogQrcode(Context context) {
            this(context ,null);
        }

        public DialogQrcode(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.dialog_qrcode;
            public static int imgQrCodeNewDevice = R.id.imgQrCodeNewDevice;
            public static int prgWaitQrCode = R.id.prgWaitQrCode;
        }
    }

    public static class DialogRatingCall {
        public LinearLayout root;
        public LinearLayout arb_layout_rate;
        public RatingBar arb_ratingBar_call;
        public MEditText arb_edt_resone;

        public DialogRatingCall(Context context,ViewGroup parent) {
            this(context,parent, R.layout.dialog_rating_call );
        }

        public DialogRatingCall(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            arb_layout_rate = (LinearLayout) root.findViewById( R.id.arb_layout_rate);
            arb_ratingBar_call = (RatingBar) root.findViewById( R.id.arb_ratingBar_call);
            arb_edt_resone = (MEditText) root.findViewById( R.id.arb_edt_resone);
        }

        public DialogRatingCall(Context context) {
            this(context ,null);
        }

        public DialogRatingCall(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.dialog_rating_call;
            public static int arb_layout_rate = R.id.arb_layout_rate;
            public static int arb_ratingBar_call = R.id.arb_ratingBar_call;
            public static int arb_edt_resone = R.id.arb_edt_resone;
        }
    }

    public static class DialogRemindTime {
        public LinearLayout root;
        public TextView textRemindTime;
        public HeaderTextview remindTime;

        public DialogRemindTime(Context context,ViewGroup parent) {
            this(context,parent, R.layout.dialog_remind_time );
        }

        public DialogRemindTime(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            textRemindTime = (TextView) root.findViewById( R.id.textRemindTime);
            remindTime = (HeaderTextview) root.findViewById( R.id.remindTime);
        }

        public DialogRemindTime(Context context) {
            this(context ,null);
        }

        public DialogRemindTime(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.dialog_remind_time;
            public static int textRemindTime = R.id.textRemindTime;
            public static int remindTime = R.id.remindTime;
        }
    }

    public static class DialogSelectColor {
        public LinearLayout root;
        public ImageView imageView_square_color;
        public ImageView imageView_line_color;
        public Button button_ok;
        public Button button_cancel;

        public DialogSelectColor(Context context,ViewGroup parent) {
            this(context,parent, R.layout.dialog_select_color );
        }

        public DialogSelectColor(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            imageView_square_color = (ImageView) root.findViewById( R.id.imageView_square_color);
            imageView_line_color = (ImageView) root.findViewById( R.id.imageView_line_color);
            button_ok = (Button) root.findViewById( R.id.button_ok);
            button_cancel = (Button) root.findViewById( R.id.button_cancel);
        }

        public DialogSelectColor(Context context) {
            this(context ,null);
        }

        public DialogSelectColor(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.dialog_select_color;
            public static int imageView_square_color = R.id.imageView_square_color;
            public static int imageView_line_color = R.id.imageView_line_color;
            public static int button_ok = R.id.button_ok;
            public static int button_cancel = R.id.button_cancel;
        }
    }

    public static class EmptyInfoMap {
        public LinearLayout root;

        public EmptyInfoMap(Context context,ViewGroup parent) {
            this(context,parent, R.layout.empty_info_map );
        }

        public EmptyInfoMap(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
        }

        public EmptyInfoMap(Context context) {
            this(context ,null);
        }

        public EmptyInfoMap(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.empty_info_map;
        }
    }

    public static class EmptyLayout {
        public LinearLayout root;
        public ImageView imageView3;
        public TextView textView7;

        public EmptyLayout(Context context,ViewGroup parent) {
            this(context,parent, R.layout.empty_layout );
        }

        public EmptyLayout(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            imageView3 = (ImageView) root.findViewById( R.id.imageView3);
            textView7 = (TextView) root.findViewById( R.id.textView7);
        }

        public EmptyLayout(Context context) {
            this(context ,null);
        }

        public EmptyLayout(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.empty_layout;
            public static int imageView3 = R.id.imageView3;
            public static int textView7 = R.id.textView7;
        }
    }

    public static class FragmentActiveSessions {
        public RelativeLayout root;
        public RelativeLayout stas_rootActiveSession;
        public AppBarLayout acs_toolbar;
        public Toolbar acs_toolbar_session;
        public RippleView stas_ripple_back;
        public MaterialDesignTextView stas_txt_back;
        public RecyclerView stas_rcvContent;
        public ProgressBar stas_prgWaiting;

        public FragmentActiveSessions(Context context,ViewGroup parent) {
            this(context,parent, R.layout.fragment_active_sessions );
        }

        public FragmentActiveSessions(Context context,ViewGroup parent, int layout) {
            root = (RelativeLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            stas_rootActiveSession = (RelativeLayout) root.findViewById( R.id.stas_rootActiveSession);
            acs_toolbar = (AppBarLayout) root.findViewById( R.id.acs_toolbar);
            acs_toolbar_session = (Toolbar) root.findViewById( R.id.acs_toolbar_session);
            stas_ripple_back = (RippleView) root.findViewById( R.id.stas_ripple_back);
            stas_txt_back = (MaterialDesignTextView) root.findViewById( R.id.stas_txt_back);
            stas_rcvContent = (RecyclerView) root.findViewById( R.id.stas_rcvContent);
            stas_prgWaiting = (ProgressBar) root.findViewById( R.id.stas_prgWaiting);
        }

        public FragmentActiveSessions(Context context) {
            this(context ,null);
        }

        public FragmentActiveSessions(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.fragment_active_sessions;
            public static int stas_rootActiveSession = R.id.stas_rootActiveSession;
            public static int acs_toolbar = R.id.acs_toolbar;
            public static int acs_toolbar_session = R.id.acs_toolbar_session;
            public static int stas_ripple_back = R.id.stas_ripple_back;
            public static int stas_txt_back = R.id.stas_txt_back;
            public static int stas_rcvContent = R.id.stas_rcvContent;
            public static int stas_prgWaiting = R.id.stas_prgWaiting;
        }
    }

    public static class FragmentAddContact {
        public LinearLayout root;
        public LinearLayout ac_layoutParent;
        public Toolbar fac_ll_toolbar;
        public TextView test;
        public RippleView ac_ripple_back;
        public MaterialDesignTextView ac_txt_back;
        public RippleView ac_ripple_set;
        public MaterialDesignTextView ac_txt_set;
        public LinearLayout rootAddContact;
        public MEditText ac_edt_firstName;
        public View ac_view_firstName;
        public MEditText ac_edt_lastName;
        public View ac_view_lastName;
        public TextView ac_txt_chooseCountry;
        public TextView ac_txt_codeCountry;
        public MaskedEditText ac_edt_phoneNumber;
        public View ac_view_phoneNumber;

        public FragmentAddContact(Context context,ViewGroup parent) {
            this(context,parent, R.layout.fragment_add_contact );
        }

        public FragmentAddContact(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            ac_layoutParent = (LinearLayout) root.findViewById( R.id.ac_layoutParent);
            fac_ll_toolbar = (Toolbar) root.findViewById( R.id.fac_ll_toolbar);
            test = (TextView) root.findViewById( R.id.test);
            ac_ripple_back = (RippleView) root.findViewById( R.id.ac_ripple_back);
            ac_txt_back = (MaterialDesignTextView) root.findViewById( R.id.ac_txt_back);
            ac_ripple_set = (RippleView) root.findViewById( R.id.ac_ripple_set);
            ac_txt_set = (MaterialDesignTextView) root.findViewById( R.id.ac_txt_set);
            rootAddContact = (LinearLayout) root.findViewById( R.id.rootAddContact);
            ac_edt_firstName = (MEditText) root.findViewById( R.id.ac_edt_firstName);
            ac_view_firstName = (View) root.findViewById( R.id.ac_view_firstName);
            ac_edt_lastName = (MEditText) root.findViewById( R.id.ac_edt_lastName);
            ac_view_lastName = (View) root.findViewById( R.id.ac_view_lastName);
            ac_txt_chooseCountry = (TextView) root.findViewById( R.id.ac_txt_chooseCountry);
            ac_txt_codeCountry = (TextView) root.findViewById( R.id.ac_txt_codeCountry);
            ac_edt_phoneNumber = (MaskedEditText) root.findViewById( R.id.ac_edt_phoneNumber);
            ac_view_phoneNumber = (View) root.findViewById( R.id.ac_view_phoneNumber);
        }

        public FragmentAddContact(Context context) {
            this(context ,null);
        }

        public FragmentAddContact(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.fragment_add_contact;
            public static int ac_layoutParent = R.id.ac_layoutParent;
            public static int fac_ll_toolbar = R.id.fac_ll_toolbar;
            public static int test = R.id.test;
            public static int ac_ripple_back = R.id.ac_ripple_back;
            public static int ac_txt_back = R.id.ac_txt_back;
            public static int ac_ripple_set = R.id.ac_ripple_set;
            public static int ac_txt_set = R.id.ac_txt_set;
            public static int rootAddContact = R.id.rootAddContact;
            public static int ac_edt_firstName = R.id.ac_edt_firstName;
            public static int ac_view_firstName = R.id.ac_view_firstName;
            public static int ac_edt_lastName = R.id.ac_edt_lastName;
            public static int ac_view_lastName = R.id.ac_view_lastName;
            public static int ac_txt_chooseCountry = R.id.ac_txt_chooseCountry;
            public static int ac_txt_codeCountry = R.id.ac_txt_codeCountry;
            public static int ac_edt_phoneNumber = R.id.ac_edt_phoneNumber;
            public static int ac_view_phoneNumber = R.id.ac_view_phoneNumber;
        }
    }

    public static class FragmentBlockedUser {
        public LinearLayout root;
        public LinearLayout fbu_ll_toolbar;
        public RippleView fbu_ripple_back_Button;
        public RippleView fbu_ripple_add;
        public RecyclerView fbu_realm_recycler_view;

        public FragmentBlockedUser(Context context,ViewGroup parent) {
            this(context,parent, R.layout.fragment_blocked_user );
        }

        public FragmentBlockedUser(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            fbu_ll_toolbar = (LinearLayout) root.findViewById( R.id.fbu_ll_toolbar);
            fbu_ripple_back_Button = (RippleView) root.findViewById( R.id.fbu_ripple_back_Button);
            fbu_ripple_add = (RippleView) root.findViewById( R.id.fbu_ripple_add);
            fbu_realm_recycler_view = (RecyclerView) root.findViewById( R.id.fbu_realm_recycler_view);
        }

        public FragmentBlockedUser(Context context) {
            this(context ,null);
        }

        public FragmentBlockedUser(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.fragment_blocked_user;
            public static int fbu_ll_toolbar = R.id.fbu_ll_toolbar;
            public static int fbu_ripple_back_Button = R.id.fbu_ripple_back_Button;
            public static int fbu_ripple_add = R.id.fbu_ripple_add;
            public static int fbu_realm_recycler_view = R.id.fbu_realm_recycler_view;
        }
    }

    public static class FragmentCall {
        public LinearLayout root;
        public LinearLayout fc_layot_title;
        public RippleView fc_call_ripple_txtBack;
        public MaterialDesignTextView fc_btn_menu;
        public RecyclerView fc_recycler_view_call;
        public FloatingActionButton fc_fab_contact_list;
        public ProgressBar fc_progress_bar_waiting;
        public AppCompatImageView img_icCall;
        public TextView textEmptyCal;

        public FragmentCall(Context context,ViewGroup parent) {
            this(context,parent, R.layout.fragment_call );
        }

        public FragmentCall(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            fc_layot_title = (LinearLayout) root.findViewById( R.id.fc_layot_title);
            fc_call_ripple_txtBack = (RippleView) root.findViewById( R.id.fc_call_ripple_txtBack);
            fc_btn_menu = (MaterialDesignTextView) root.findViewById( R.id.fc_btn_menu);
            fc_recycler_view_call = (RecyclerView) root.findViewById( R.id.fc_recycler_view_call);
            fc_fab_contact_list = (FloatingActionButton) root.findViewById( R.id.fc_fab_contact_list);
            fc_progress_bar_waiting = (ProgressBar) root.findViewById( R.id.fc_progress_bar_waiting);
            img_icCall = (AppCompatImageView) root.findViewById( R.id.img_icCall);
            textEmptyCal = (TextView) root.findViewById( R.id.textEmptyCal);
        }

        public FragmentCall(Context context) {
            this(context ,null);
        }

        public FragmentCall(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.fragment_call;
            public static int fc_layot_title = R.id.fc_layot_title;
            public static int fc_call_ripple_txtBack = R.id.fc_call_ripple_txtBack;
            public static int fc_btn_menu = R.id.fc_btn_menu;
            public static int fc_recycler_view_call = R.id.fc_recycler_view_call;
            public static int fc_fab_contact_list = R.id.fc_fab_contact_list;
            public static int fc_progress_bar_waiting = R.id.fc_progress_bar_waiting;
            public static int img_icCall = R.id.img_icCall;
            public static int textEmptyCal = R.id.textEmptyCal;
        }
    }

    public static class FragmentCallSubLayout {
        public LinearLayout root;
        public CircleImageView fcsl_imv_picture;
        public EmojiTextViewE fcsl_txt_name;
        public TextView fcsl_txt_time_info;
        public MaterialDesignTextView fcsl_txt_icon;
        public TextView fcsl_txt_dureation_time;

        public FragmentCallSubLayout(Context context,ViewGroup parent) {
            this(context,parent, R.layout.fragment_call_sub_layout );
        }

        public FragmentCallSubLayout(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            fcsl_imv_picture = (CircleImageView) root.findViewById( R.id.fcsl_imv_picture);
            fcsl_txt_name = (EmojiTextViewE) root.findViewById( R.id.fcsl_txt_name);
            fcsl_txt_time_info = (TextView) root.findViewById( R.id.fcsl_txt_time_info);
            fcsl_txt_icon = (MaterialDesignTextView) root.findViewById( R.id.fcsl_txt_icon);
            fcsl_txt_dureation_time = (TextView) root.findViewById( R.id.fcsl_txt_dureation_time);
        }

        public FragmentCallSubLayout(Context context) {
            this(context ,null);
        }

        public FragmentCallSubLayout(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.fragment_call_sub_layout;
            public static int fcsl_imv_picture = R.id.fcsl_imv_picture;
            public static int fcsl_txt_name = R.id.fcsl_txt_name;
            public static int fcsl_txt_time_info = R.id.fcsl_txt_time_info;
            public static int fcsl_txt_icon = R.id.fcsl_txt_icon;
            public static int fcsl_txt_dureation_time = R.id.fcsl_txt_dureation_time;
        }
    }

    public static class FragmentCallSubLayoutCode {
        public LinearLayout root;

        public FragmentCallSubLayoutCode(Context context,ViewGroup parent) {
            this(context,parent, R.layout.fragment_call_sub_layout_code );
        }

        public FragmentCallSubLayoutCode(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
        }

        public FragmentCallSubLayoutCode(Context context) {
            this(context ,null);
        }

        public FragmentCallSubLayoutCode(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.fragment_call_sub_layout_code;
        }
    }

    public static class FragmentChatToGroup {
        public FrameLayout root;

        public FragmentChatToGroup(Context context,ViewGroup parent) {
            this(context,parent, R.layout.fragment_chat_to_group );
        }

        public FragmentChatToGroup(Context context,ViewGroup parent, int layout) {
            root = (FrameLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
        }

        public FragmentChatToGroup(Context context) {
            this(context ,null);
        }

        public FragmentChatToGroup(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.fragment_chat_to_group;
        }
    }

    public static class FragmentChooseCountry {
        public LinearLayout root;
        public LinearLayout rootChooseCountry;
        public Toolbar fac_ll_toolbar;
        public RippleView ac_ripple_back;
        public MaterialDesignTextView ac_txt_back;
        public MEditText edtCountrySearch;
        public RippleView ac_ripple_set;
        public MaterialDesignTextView ac_txt_set;
        public RecyclerView rcvChooseCountry;

        public FragmentChooseCountry(Context context,ViewGroup parent) {
            this(context,parent, R.layout.fragment_choose_country );
        }

        public FragmentChooseCountry(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            rootChooseCountry = (LinearLayout) root.findViewById( R.id.rootChooseCountry);
            fac_ll_toolbar = (Toolbar) root.findViewById( R.id.fac_ll_toolbar);
            ac_ripple_back = (RippleView) root.findViewById( R.id.ac_ripple_back);
            ac_txt_back = (MaterialDesignTextView) root.findViewById( R.id.ac_txt_back);
            edtCountrySearch = (MEditText) root.findViewById( R.id.edtCountrySearch);
            ac_ripple_set = (RippleView) root.findViewById( R.id.ac_ripple_set);
            ac_txt_set = (MaterialDesignTextView) root.findViewById( R.id.ac_txt_set);
            rcvChooseCountry = (RecyclerView) root.findViewById( R.id.rcvChooseCountry);
        }

        public FragmentChooseCountry(Context context) {
            this(context ,null);
        }

        public FragmentChooseCountry(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.fragment_choose_country;
            public static int rootChooseCountry = R.id.rootChooseCountry;
            public static int fac_ll_toolbar = R.id.fac_ll_toolbar;
            public static int ac_ripple_back = R.id.ac_ripple_back;
            public static int ac_txt_back = R.id.ac_txt_back;
            public static int edtCountrySearch = R.id.edtCountrySearch;
            public static int ac_ripple_set = R.id.ac_ripple_set;
            public static int ac_txt_set = R.id.ac_txt_set;
            public static int rcvChooseCountry = R.id.rcvChooseCountry;
        }
    }

    public static class FragmentContactGroup {
        public RelativeLayout root;
        public RelativeLayout fcg_layoutRoot;
        public AppBarLayout fcg_appbar;
        public LinearLayout fcg_ll_toolbar;
        public RippleView fcg_ripple_back;
        public MaterialDesignTextView fcg_btn_back;
        public TextView fcg_txt_status;
        public TextView fcg_txt_number_of_member;
        public RippleView fcg_ripple_done;
        public MaterialDesignTextView fcg_btn_done;
        public LinearLayout fcg_layout_search;
        public ChipsInput chips_input;
        public RecyclerView fcg_recycler_view_add_item_to_group;
        public LinearLayout acs_ll_replay;
        public CircleImageView acs_imv_replay_pic;
        public TextView acs_txt_replay_from;
        public TextView acs_txt_replay_message;
        public MaterialDesignTextView acs_btn_close;
        public ProgressBar fcg_prgWaiting;

        public FragmentContactGroup(Context context,ViewGroup parent) {
            this(context,parent, R.layout.fragment_contact_group );
        }

        public FragmentContactGroup(Context context,ViewGroup parent, int layout) {
            root = (RelativeLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            fcg_layoutRoot = (RelativeLayout) root.findViewById( R.id.fcg_layoutRoot);
            fcg_appbar = (AppBarLayout) root.findViewById( R.id.fcg_appbar);
            fcg_ll_toolbar = (LinearLayout) root.findViewById( R.id.fcg_ll_toolbar);
            fcg_ripple_back = (RippleView) root.findViewById( R.id.fcg_ripple_back);
            fcg_btn_back = (MaterialDesignTextView) root.findViewById( R.id.fcg_btn_back);
            fcg_txt_status = (TextView) root.findViewById( R.id.fcg_txt_status);
            fcg_txt_number_of_member = (TextView) root.findViewById( R.id.fcg_txt_number_of_member);
            fcg_ripple_done = (RippleView) root.findViewById( R.id.fcg_ripple_done);
            fcg_btn_done = (MaterialDesignTextView) root.findViewById( R.id.fcg_btn_done);
            fcg_layout_search = (LinearLayout) root.findViewById( R.id.fcg_layout_search);
            chips_input = (ChipsInput) root.findViewById( R.id.chips_input);
            fcg_recycler_view_add_item_to_group = (RecyclerView) root.findViewById( R.id.fcg_recycler_view_add_item_to_group);
            acs_ll_replay = (LinearLayout) root.findViewById( R.id.acs_ll_replay);
            acs_imv_replay_pic = (CircleImageView) root.findViewById( R.id.acs_imv_replay_pic);
            acs_txt_replay_from = (TextView) root.findViewById( R.id.acs_txt_replay_from);
            acs_txt_replay_message = (TextView) root.findViewById( R.id.acs_txt_replay_message);
            acs_btn_close = (MaterialDesignTextView) root.findViewById( R.id.acs_btn_close);
            fcg_prgWaiting = (ProgressBar) root.findViewById( R.id.fcg_prgWaiting);
        }

        public FragmentContactGroup(Context context) {
            this(context ,null);
        }

        public FragmentContactGroup(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.fragment_contact_group;
            public static int fcg_layoutRoot = R.id.fcg_layoutRoot;
            public static int fcg_appbar = R.id.fcg_appbar;
            public static int fcg_ll_toolbar = R.id.fcg_ll_toolbar;
            public static int fcg_ripple_back = R.id.fcg_ripple_back;
            public static int fcg_btn_back = R.id.fcg_btn_back;
            public static int fcg_txt_status = R.id.fcg_txt_status;
            public static int fcg_txt_number_of_member = R.id.fcg_txt_number_of_member;
            public static int fcg_ripple_done = R.id.fcg_ripple_done;
            public static int fcg_btn_done = R.id.fcg_btn_done;
            public static int fcg_layout_search = R.id.fcg_layout_search;
            public static int chips_input = R.id.chips_input;
            public static int fcg_recycler_view_add_item_to_group = R.id.fcg_recycler_view_add_item_to_group;
            public static int acs_ll_replay = R.id.acs_ll_replay;
            public static int acs_imv_replay_pic = R.id.acs_imv_replay_pic;
            public static int acs_txt_replay_from = R.id.acs_txt_replay_from;
            public static int acs_txt_replay_message = R.id.acs_txt_replay_message;
            public static int acs_btn_close = R.id.acs_btn_close;
            public static int fcg_prgWaiting = R.id.fcg_prgWaiting;
        }
    }

    public static class FragmentContacts {
        public RelativeLayout root;
        public RelativeLayout menu_parent_layout;
        public AppBarLayout fc_layot_title;
        public RippleView menu_ripple_txtBack;
        public MaterialDesignTextView menu_txtBack;
        public TextView menu_txt_titleToolbar;
        public RippleView menu_edtSearch;
        public MaterialDesignTextView menu_btn_search;
        public EditText menu_edt_search;
        public RippleView menu_ripple_close;
        public MaterialDesignTextView menu_btn_close;
        public MyAppBarLayout appBarLayout;
        public LinearLayout menu_layout_addContact;
        public CustomTextViewMedium title;
        public NestedScrollView nestedScrollContact;
        public RecyclerView recycler_view;
        public ProgressBar prgWaitingLoadContact;
        public TextView txtNon_User;
        public RecyclerView rcv_friends_to_invite;
        public ProgressBar prgWaiting_loadList;
        public ProgressBar prgWaiting_addContact;

        public FragmentContacts(Context context,ViewGroup parent) {
            this(context,parent, R.layout.fragment_contacts );
        }

        public FragmentContacts(Context context,ViewGroup parent, int layout) {
            root = (RelativeLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            menu_parent_layout = (RelativeLayout) root.findViewById( R.id.menu_parent_layout);
            fc_layot_title = (AppBarLayout) root.findViewById( R.id.fc_layot_title);
            menu_ripple_txtBack = (RippleView) root.findViewById( R.id.menu_ripple_txtBack);
            menu_txtBack = (MaterialDesignTextView) root.findViewById( R.id.menu_txtBack);
            menu_txt_titleToolbar = (TextView) root.findViewById( R.id.menu_txt_titleToolbar);
            menu_edtSearch = (RippleView) root.findViewById( R.id.menu_edtSearch);
            menu_btn_search = (MaterialDesignTextView) root.findViewById( R.id.menu_btn_search);
            menu_edt_search = (EditText) root.findViewById( R.id.menu_edt_search);
            menu_ripple_close = (RippleView) root.findViewById( R.id.menu_ripple_close);
            menu_btn_close = (MaterialDesignTextView) root.findViewById( R.id.menu_btn_close);
            appBarLayout = (MyAppBarLayout) root.findViewById( R.id.appBarLayout);
            menu_layout_addContact = (LinearLayout) root.findViewById( R.id.menu_layout_addContact);
            title = (CustomTextViewMedium) root.findViewById( R.id.title);
            nestedScrollContact = (NestedScrollView) root.findViewById( R.id.nestedScrollContact);
            recycler_view = (RecyclerView) root.findViewById( R.id.recycler_view);
            prgWaitingLoadContact = (ProgressBar) root.findViewById( R.id.prgWaitingLoadContact);
            txtNon_User = (TextView) root.findViewById( R.id.txtNon_User);
            rcv_friends_to_invite = (RecyclerView) root.findViewById( R.id.rcv_friends_to_invite);
            prgWaiting_loadList = (ProgressBar) root.findViewById( R.id.prgWaiting_loadList);
            prgWaiting_addContact = (ProgressBar) root.findViewById( R.id.prgWaiting_addContact);
        }

        public FragmentContacts(Context context) {
            this(context ,null);
        }

        public FragmentContacts(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.fragment_contacts;
            public static int menu_parent_layout = R.id.menu_parent_layout;
            public static int fc_layot_title = R.id.fc_layot_title;
            public static int menu_ripple_txtBack = R.id.menu_ripple_txtBack;
            public static int menu_txtBack = R.id.menu_txtBack;
            public static int menu_txt_titleToolbar = R.id.menu_txt_titleToolbar;
            public static int menu_edtSearch = R.id.menu_edtSearch;
            public static int menu_btn_search = R.id.menu_btn_search;
            public static int menu_edt_search = R.id.menu_edt_search;
            public static int menu_ripple_close = R.id.menu_ripple_close;
            public static int menu_btn_close = R.id.menu_btn_close;
            public static int appBarLayout = R.id.appBarLayout;
            public static int menu_layout_addContact = R.id.menu_layout_addContact;
            public static int title = R.id.title;
            public static int nestedScrollContact = R.id.nestedScrollContact;
            public static int recycler_view = R.id.recycler_view;
            public static int prgWaitingLoadContact = R.id.prgWaitingLoadContact;
            public static int txtNon_User = R.id.txtNon_User;
            public static int rcv_friends_to_invite = R.id.rcv_friends_to_invite;
            public static int prgWaiting_loadList = R.id.prgWaiting_loadList;
            public static int prgWaiting_addContact = R.id.prgWaiting_addContact;
        }
    }

    public static class FragmentDeleteAccount {
        public LinearLayout root;
        public LinearLayout rootDeleteAccount;
        public Toolbar fda_ll_toolbar;
        public RippleView stda_ripple_back;
        public RippleView stda_ripple_set;
        public TextView stda_txt_phoneNumber;
        public EditTextAdjustPan stda_edt_dleteAccount;
        public View stda_line_below_editText;
        public RelativeLayout stda_layout_time;
        public TextView stda_txt_time;
        public TextView stda_txt_text;
        public ProgressBar stda_prgWaiting_addContact;

        public FragmentDeleteAccount(Context context,ViewGroup parent) {
            this(context,parent, R.layout.fragment_delete_account );
        }

        public FragmentDeleteAccount(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            rootDeleteAccount = (LinearLayout) root.findViewById( R.id.rootDeleteAccount);
            fda_ll_toolbar = (Toolbar) root.findViewById( R.id.fda_ll_toolbar);
            stda_ripple_back = (RippleView) root.findViewById( R.id.stda_ripple_back);
            stda_ripple_set = (RippleView) root.findViewById( R.id.stda_ripple_set);
            stda_txt_phoneNumber = (TextView) root.findViewById( R.id.stda_txt_phoneNumber);
            stda_edt_dleteAccount = (EditTextAdjustPan) root.findViewById( R.id.stda_edt_dleteAccount);
            stda_line_below_editText = (View) root.findViewById( R.id.stda_line_below_editText);
            stda_layout_time = (RelativeLayout) root.findViewById( R.id.stda_layout_time);
            stda_txt_time = (TextView) root.findViewById( R.id.stda_txt_time);
            stda_txt_text = (TextView) root.findViewById( R.id.stda_txt_text);
            stda_prgWaiting_addContact = (ProgressBar) root.findViewById( R.id.stda_prgWaiting_addContact);
        }

        public FragmentDeleteAccount(Context context) {
            this(context ,null);
        }

        public FragmentDeleteAccount(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.fragment_delete_account;
            public static int rootDeleteAccount = R.id.rootDeleteAccount;
            public static int fda_ll_toolbar = R.id.fda_ll_toolbar;
            public static int stda_ripple_back = R.id.stda_ripple_back;
            public static int stda_ripple_set = R.id.stda_ripple_set;
            public static int stda_txt_phoneNumber = R.id.stda_txt_phoneNumber;
            public static int stda_edt_dleteAccount = R.id.stda_edt_dleteAccount;
            public static int stda_line_below_editText = R.id.stda_line_below_editText;
            public static int stda_layout_time = R.id.stda_layout_time;
            public static int stda_txt_time = R.id.stda_txt_time;
            public static int stda_txt_text = R.id.stda_txt_text;
            public static int stda_prgWaiting_addContact = R.id.stda_prgWaiting_addContact;
        }
    }

    public static class FragmentEditImage {
        public RelativeLayout root;
        public RelativeLayout ac_ll_parent;
        public LinearLayout stfaq_allLayout_toolbar;
        public RippleView pu_ripple_back;
        public MaterialDesignTextView pu_txt_agreeImage;
        public TextView stfaq_txt_titleToolbar;
        public MaterialDesignTextView txtSet;
        public ImageView imgEditImage;
        public LinearLayout layout_caption;
        public MaterialDesignTextView chl_imv_smile_button;
        public EmojiEditTextE chl_edt_chat;
        public LinearLayout pu_layout_cancel_crop;
        public MaterialDesignTextView pu_txt_crop;
        public MaterialDesignTextView txtEditImage;
        public MaterialDesignTextView pu_txt_sendImage;

        public FragmentEditImage(Context context,ViewGroup parent) {
            this(context,parent, R.layout.fragment_edit_image );
        }

        public FragmentEditImage(Context context,ViewGroup parent, int layout) {
            root = (RelativeLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            ac_ll_parent = (RelativeLayout) root.findViewById( R.id.ac_ll_parent);
            stfaq_allLayout_toolbar = (LinearLayout) root.findViewById( R.id.stfaq_allLayout_toolbar);
            pu_ripple_back = (RippleView) root.findViewById( R.id.pu_ripple_back);
            pu_txt_agreeImage = (MaterialDesignTextView) root.findViewById( R.id.pu_txt_agreeImage);
            stfaq_txt_titleToolbar = (TextView) root.findViewById( R.id.stfaq_txt_titleToolbar);
            txtSet = (MaterialDesignTextView) root.findViewById( R.id.txtSet);
            imgEditImage = (ImageView) root.findViewById( R.id.imgEditImage);
            layout_caption = (LinearLayout) root.findViewById( R.id.layout_caption);
            chl_imv_smile_button = (MaterialDesignTextView) root.findViewById( R.id.chl_imv_smile_button);
            chl_edt_chat = (EmojiEditTextE) root.findViewById( R.id.chl_edt_chat);
            pu_layout_cancel_crop = (LinearLayout) root.findViewById( R.id.pu_layout_cancel_crop);
            pu_txt_crop = (MaterialDesignTextView) root.findViewById( R.id.pu_txt_crop);
            txtEditImage = (MaterialDesignTextView) root.findViewById( R.id.txtEditImage);
            pu_txt_sendImage = (MaterialDesignTextView) root.findViewById( R.id.pu_txt_sendImage);
        }

        public FragmentEditImage(Context context) {
            this(context ,null);
        }

        public FragmentEditImage(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.fragment_edit_image;
            public static int ac_ll_parent = R.id.ac_ll_parent;
            public static int stfaq_allLayout_toolbar = R.id.stfaq_allLayout_toolbar;
            public static int pu_ripple_back = R.id.pu_ripple_back;
            public static int pu_txt_agreeImage = R.id.pu_txt_agreeImage;
            public static int stfaq_txt_titleToolbar = R.id.stfaq_txt_titleToolbar;
            public static int txtSet = R.id.txtSet;
            public static int imgEditImage = R.id.imgEditImage;
            public static int layout_caption = R.id.layout_caption;
            public static int chl_imv_smile_button = R.id.chl_imv_smile_button;
            public static int chl_edt_chat = R.id.chl_edt_chat;
            public static int pu_layout_cancel_crop = R.id.pu_layout_cancel_crop;
            public static int pu_txt_crop = R.id.pu_txt_crop;
            public static int txtEditImage = R.id.txtEditImage;
            public static int pu_txt_sendImage = R.id.pu_txt_sendImage;
        }
    }

    public static class FragmentEnterPassword {
        public LinearLayout root;
        public LinearLayout rootFragmentSecurity;
        public Toolbar stps_backgroundToolbar;
        public RippleView verifyPassword_rippleOk;
        public RippleView tsv_ripple_back;
        public LinearLayout rootEnterPassword;
        public EditText setPassword_edtSetPassword;
        public TextView txtSkip;
        public TextView txtRecoveryEmail;
        public LinearLayout RootRecoveryQuestion;
        public TextView edtSetQuestionPassOne;
        public EditText edtSetAnswerPassOne;
        public TextView edtSetQuestionPassTwo;
        public EditText edtSetAnswerPassTwo;
        public LinearLayout rootRecoveryEmail;
        public EditText setPassword_edtSetPasswordRecoveryEmail;
        public TextView txtRecentRecoveryEmail;

        public FragmentEnterPassword(Context context,ViewGroup parent) {
            this(context,parent, R.layout.fragment_enter_password );
        }

        public FragmentEnterPassword(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            rootFragmentSecurity = (LinearLayout) root.findViewById( R.id.rootFragmentSecurity);
            stps_backgroundToolbar = (Toolbar) root.findViewById( R.id.stps_backgroundToolbar);
            verifyPassword_rippleOk = (RippleView) root.findViewById( R.id.verifyPassword_rippleOk);
            tsv_ripple_back = (RippleView) root.findViewById( R.id.tsv_ripple_back);
            rootEnterPassword = (LinearLayout) root.findViewById( R.id.rootEnterPassword);
            setPassword_edtSetPassword = (EditText) root.findViewById( R.id.setPassword_edtSetPassword);
            txtSkip = (TextView) root.findViewById( R.id.txtSkip);
            txtRecoveryEmail = (TextView) root.findViewById( R.id.txtRecoveryEmail);
            RootRecoveryQuestion = (LinearLayout) root.findViewById( R.id.RootRecoveryQuestion);
            edtSetQuestionPassOne = (TextView) root.findViewById( R.id.edtSetQuestionPassOne);
            edtSetAnswerPassOne = (EditText) root.findViewById( R.id.edtSetAnswerPassOne);
            edtSetQuestionPassTwo = (TextView) root.findViewById( R.id.edtSetQuestionPassTwo);
            edtSetAnswerPassTwo = (EditText) root.findViewById( R.id.edtSetAnswerPassTwo);
            rootRecoveryEmail = (LinearLayout) root.findViewById( R.id.rootRecoveryEmail);
            setPassword_edtSetPasswordRecoveryEmail = (EditText) root.findViewById( R.id.setPassword_edtSetPasswordRecoveryEmail);
            txtRecentRecoveryEmail = (TextView) root.findViewById( R.id.txtRecentRecoveryEmail);
        }

        public FragmentEnterPassword(Context context) {
            this(context ,null);
        }

        public FragmentEnterPassword(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.fragment_enter_password;
            public static int rootFragmentSecurity = R.id.rootFragmentSecurity;
            public static int stps_backgroundToolbar = R.id.stps_backgroundToolbar;
            public static int verifyPassword_rippleOk = R.id.verifyPassword_rippleOk;
            public static int tsv_ripple_back = R.id.tsv_ripple_back;
            public static int rootEnterPassword = R.id.rootEnterPassword;
            public static int setPassword_edtSetPassword = R.id.setPassword_edtSetPassword;
            public static int txtSkip = R.id.txtSkip;
            public static int txtRecoveryEmail = R.id.txtRecoveryEmail;
            public static int RootRecoveryQuestion = R.id.RootRecoveryQuestion;
            public static int edtSetQuestionPassOne = R.id.edtSetQuestionPassOne;
            public static int edtSetAnswerPassOne = R.id.edtSetAnswerPassOne;
            public static int edtSetQuestionPassTwo = R.id.edtSetQuestionPassTwo;
            public static int edtSetAnswerPassTwo = R.id.edtSetAnswerPassTwo;
            public static int rootRecoveryEmail = R.id.rootRecoveryEmail;
            public static int setPassword_edtSetPasswordRecoveryEmail = R.id.setPassword_edtSetPasswordRecoveryEmail;
            public static int txtRecentRecoveryEmail = R.id.txtRecentRecoveryEmail;
        }
    }

    public static class FragmentFilterImage {
        public LinearLayout root;
        public LinearLayout stfaq_allLayout_toolbar;
        public RippleView pu_ripple_back;
        public MaterialDesignTextView pu_txt_agreeImage;
        public TextView stfaq_txt_titleToolbar;
        public RippleView pu_ripple_clear;
        public MaterialDesignTextView pu_txt_clear;
        public MaterialDesignTextView pu_txt_ok;
        public StyleImageView image;
        public CheckBox animation_checkbox;
        public EditText duration_edittext;
        public SeekBar seekbar_brightness;
        public SeekBar seekbar_contrast;
        public RecyclerView rcvEditImage;

        public FragmentFilterImage(Context context,ViewGroup parent) {
            this(context,parent, R.layout.fragment_filter_image );
        }

        public FragmentFilterImage(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            stfaq_allLayout_toolbar = (LinearLayout) root.findViewById( R.id.stfaq_allLayout_toolbar);
            pu_ripple_back = (RippleView) root.findViewById( R.id.pu_ripple_back);
            pu_txt_agreeImage = (MaterialDesignTextView) root.findViewById( R.id.pu_txt_agreeImage);
            stfaq_txt_titleToolbar = (TextView) root.findViewById( R.id.stfaq_txt_titleToolbar);
            pu_ripple_clear = (RippleView) root.findViewById( R.id.pu_ripple_clear);
            pu_txt_clear = (MaterialDesignTextView) root.findViewById( R.id.pu_txt_clear);
            pu_txt_ok = (MaterialDesignTextView) root.findViewById( R.id.pu_txt_ok);
            image = (StyleImageView) root.findViewById( R.id.image);
            animation_checkbox = (CheckBox) root.findViewById( R.id.animation_checkbox);
            duration_edittext = (EditText) root.findViewById( R.id.duration_edittext);
            seekbar_brightness = (SeekBar) root.findViewById( R.id.seekbar_brightness);
            seekbar_contrast = (SeekBar) root.findViewById( R.id.seekbar_contrast);
            rcvEditImage = (RecyclerView) root.findViewById( R.id.rcvEditImage);
        }

        public FragmentFilterImage(Context context) {
            this(context ,null);
        }

        public FragmentFilterImage(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.fragment_filter_image;
            public static int stfaq_allLayout_toolbar = R.id.stfaq_allLayout_toolbar;
            public static int pu_ripple_back = R.id.pu_ripple_back;
            public static int pu_txt_agreeImage = R.id.pu_txt_agreeImage;
            public static int stfaq_txt_titleToolbar = R.id.stfaq_txt_titleToolbar;
            public static int pu_ripple_clear = R.id.pu_ripple_clear;
            public static int pu_txt_clear = R.id.pu_txt_clear;
            public static int pu_txt_ok = R.id.pu_txt_ok;
            public static int image = R.id.image;
            public static int animation_checkbox = R.id.animation_checkbox;
            public static int duration_edittext = R.id.duration_edittext;
            public static int seekbar_brightness = R.id.seekbar_brightness;
            public static int seekbar_contrast = R.id.seekbar_contrast;
            public static int rcvEditImage = R.id.rcvEditImage;
        }
    }

    public static class FragmentIgapMap {
        public SlidingUpPanelLayout root;
        public SlidingUpPanelLayout sliding_layout;
        public FrameLayout mapContainer_main;
        public RelativeLayout mapContainer;
        public AppBarLayout backgroundToolbarMap;
        public RippleView ripple_back_map;
        public MaterialDesignTextView txt_back_map;
        public TextView txt_titleToolbar_map;
        public RippleView ripple_more_map;
        public RelativeLayout replace;
        public LinearLayout vgMessageGps;
        public MEditText edtMessageGps;
        public TextView txtSendMessageGps;
        public ProgressBar prgWaitSendMessage;
        public MapView map;
        public ScrollView scrollView;
        public LinearLayout rootTurnOnGps;
        public TextView txtTextTurnOnOffGps;
        public ToggleButton toggleGps;
        public TextView txtDescriptionMap;
        public FloatingActionButton st_fab_gps;
        public View vgSlideUp;
        public MaterialDesignTextView ml_user_on_map;
        public RecyclerView rcy_map_user;

        public FragmentIgapMap(Context context,ViewGroup parent) {
            this(context,parent, R.layout.fragment_igap_map );
        }

        public FragmentIgapMap(Context context,ViewGroup parent, int layout) {
            root = (SlidingUpPanelLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            sliding_layout = (SlidingUpPanelLayout) root.findViewById( R.id.sliding_layout);
            mapContainer_main = (FrameLayout) root.findViewById( R.id.mapContainer_main);
            mapContainer = (RelativeLayout) root.findViewById( R.id.mapContainer);
            backgroundToolbarMap = (AppBarLayout) root.findViewById( R.id.backgroundToolbarMap);
            ripple_back_map = (RippleView) root.findViewById( R.id.ripple_back_map);
            txt_back_map = (MaterialDesignTextView) root.findViewById( R.id.txt_back_map);
            txt_titleToolbar_map = (TextView) root.findViewById( R.id.txt_titleToolbar_map);
            ripple_more_map = (RippleView) root.findViewById( R.id.ripple_more_map);
            replace = (RelativeLayout) root.findViewById( R.id.replace);
            vgMessageGps = (LinearLayout) root.findViewById( R.id.vgMessageGps);
            edtMessageGps = (MEditText) root.findViewById( R.id.edtMessageGps);
            txtSendMessageGps = (TextView) root.findViewById( R.id.txtSendMessageGps);
            prgWaitSendMessage = (ProgressBar) root.findViewById( R.id.prgWaitSendMessage);
            map = (MapView) root.findViewById( R.id.map);
            scrollView = (ScrollView) root.findViewById( R.id.scrollView);
            rootTurnOnGps = (LinearLayout) root.findViewById( R.id.rootTurnOnGps);
            txtTextTurnOnOffGps = (TextView) root.findViewById( R.id.txtTextTurnOnOffGps);
            toggleGps = (ToggleButton) root.findViewById( R.id.toggleGps);
            txtDescriptionMap = (TextView) root.findViewById( R.id.txtDescriptionMap);
            st_fab_gps = (FloatingActionButton) root.findViewById( R.id.st_fab_gps);
            vgSlideUp = (View) root.findViewById( R.id.vgSlideUp);
            ml_user_on_map = (MaterialDesignTextView) root.findViewById( R.id.ml_user_on_map);
            rcy_map_user = (RecyclerView) root.findViewById( R.id.rcy_map_user);
        }

        public FragmentIgapMap(Context context) {
            this(context ,null);
        }

        public FragmentIgapMap(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.fragment_igap_map;
            public static int sliding_layout = R.id.sliding_layout;
            public static int mapContainer_main = R.id.mapContainer_main;
            public static int mapContainer = R.id.mapContainer;
            public static int backgroundToolbarMap = R.id.backgroundToolbarMap;
            public static int ripple_back_map = R.id.ripple_back_map;
            public static int txt_back_map = R.id.txt_back_map;
            public static int txt_titleToolbar_map = R.id.txt_titleToolbar_map;
            public static int ripple_more_map = R.id.ripple_more_map;
            public static int replace = R.id.replace;
            public static int vgMessageGps = R.id.vgMessageGps;
            public static int edtMessageGps = R.id.edtMessageGps;
            public static int txtSendMessageGps = R.id.txtSendMessageGps;
            public static int prgWaitSendMessage = R.id.prgWaitSendMessage;
            public static int map = R.id.map;
            public static int scrollView = R.id.scrollView;
            public static int rootTurnOnGps = R.id.rootTurnOnGps;
            public static int txtTextTurnOnOffGps = R.id.txtTextTurnOnOffGps;
            public static int toggleGps = R.id.toggleGps;
            public static int txtDescriptionMap = R.id.txtDescriptionMap;
            public static int st_fab_gps = R.id.st_fab_gps;
            public static int vgSlideUp = R.id.vgSlideUp;
            public static int ml_user_on_map = R.id.ml_user_on_map;
            public static int rcy_map_user = R.id.rcy_map_user;
        }
    }

    public static class FragmentMapUsers {
        public FrameLayout root;
        public FrameLayout rootFragmentUserMap;
        public AppBarLayout toolbarMapUsers;
        public RippleView rippleBackMapUser;
        public MaterialDesignTextView txt_back_map;
        public TextView txtTitleToolbarMapUsers;
        public ImageView sfl_imv_nothing_found;
        public TextView sfl_txt_empty_list_comment;
        public RecyclerView rcy_map_user;
        public ProgressBar prgWaiting_map_user;

        public FragmentMapUsers(Context context,ViewGroup parent) {
            this(context,parent, R.layout.fragment_map_users );
        }

        public FragmentMapUsers(Context context,ViewGroup parent, int layout) {
            root = (FrameLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            rootFragmentUserMap = (FrameLayout) root.findViewById( R.id.rootFragmentUserMap);
            toolbarMapUsers = (AppBarLayout) root.findViewById( R.id.toolbarMapUsers);
            rippleBackMapUser = (RippleView) root.findViewById( R.id.rippleBackMapUser);
            txt_back_map = (MaterialDesignTextView) root.findViewById( R.id.txt_back_map);
            txtTitleToolbarMapUsers = (TextView) root.findViewById( R.id.txtTitleToolbarMapUsers);
            sfl_imv_nothing_found = (ImageView) root.findViewById( R.id.sfl_imv_nothing_found);
            sfl_txt_empty_list_comment = (TextView) root.findViewById( R.id.sfl_txt_empty_list_comment);
            rcy_map_user = (RecyclerView) root.findViewById( R.id.rcy_map_user);
            prgWaiting_map_user = (ProgressBar) root.findViewById( R.id.prgWaiting_map_user);
        }

        public FragmentMapUsers(Context context) {
            this(context ,null);
        }

        public FragmentMapUsers(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.fragment_map_users;
            public static int rootFragmentUserMap = R.id.rootFragmentUserMap;
            public static int toolbarMapUsers = R.id.toolbarMapUsers;
            public static int rippleBackMapUser = R.id.rippleBackMapUser;
            public static int txt_back_map = R.id.txt_back_map;
            public static int txtTitleToolbarMapUsers = R.id.txtTitleToolbarMapUsers;
            public static int sfl_imv_nothing_found = R.id.sfl_imv_nothing_found;
            public static int sfl_txt_empty_list_comment = R.id.sfl_txt_empty_list_comment;
            public static int rcy_map_user = R.id.rcy_map_user;
            public static int prgWaiting_map_user = R.id.prgWaiting_map_user;
        }
    }

    public static class FragmentReport {
        public LinearLayout root;
        public LinearLayout rootFragmentLanguage;
        public Toolbar asn_toolbar;
        public RippleView stns_ripple_back;
        public MaterialDesignTextView stns_txt_back;
        public RippleView verifyPassword_rippleOk;
        public LinearLayout st_layout_fa;
        public EditText edtReport;

        public FragmentReport(Context context,ViewGroup parent) {
            this(context,parent, R.layout.fragment_report );
        }

        public FragmentReport(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            rootFragmentLanguage = (LinearLayout) root.findViewById( R.id.rootFragmentLanguage);
            asn_toolbar = (Toolbar) root.findViewById( R.id.asn_toolbar);
            stns_ripple_back = (RippleView) root.findViewById( R.id.stns_ripple_back);
            stns_txt_back = (MaterialDesignTextView) root.findViewById( R.id.stns_txt_back);
            verifyPassword_rippleOk = (RippleView) root.findViewById( R.id.verifyPassword_rippleOk);
            st_layout_fa = (LinearLayout) root.findViewById( R.id.st_layout_fa);
            edtReport = (EditText) root.findViewById( R.id.edtReport);
        }

        public FragmentReport(Context context) {
            this(context ,null);
        }

        public FragmentReport(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.fragment_report;
            public static int rootFragmentLanguage = R.id.rootFragmentLanguage;
            public static int asn_toolbar = R.id.asn_toolbar;
            public static int stns_ripple_back = R.id.stns_ripple_back;
            public static int stns_txt_back = R.id.stns_txt_back;
            public static int verifyPassword_rippleOk = R.id.verifyPassword_rippleOk;
            public static int st_layout_fa = R.id.st_layout_fa;
            public static int edtReport = R.id.edtReport;
        }
    }

    public static class FragmentSecurityRecovery {
        public LinearLayout root;
        public LinearLayout rootRecoveryPassword;
        public Toolbar stps_backgroundToolbar;
        public RippleView verifyPassword_rippleOk;
        public RippleView ripple_back;
        public LinearLayout rootRecoveryQuestionPassword;
        public TextView txtSetRecoveryQuestionPassOne;
        public MEditText edtSetRecoveryAnswerPassOne;
        public TextView txtSetRecoveryQuestionPassTwo;
        public MEditText edtSetRecoveryAnswerPassTwo;
        public TextView txtSetRecoveryByEmail;
        public LinearLayout rootRecoveryEmailPassword;
        public MEditText edtSetRecoveryEmail;
        public TextView txtResendConfirmEmail;
        public TextView txtSetRecoveryByQuestion;

        public FragmentSecurityRecovery(Context context,ViewGroup parent) {
            this(context,parent, R.layout.fragment_security_recovery );
        }

        public FragmentSecurityRecovery(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            rootRecoveryPassword = (LinearLayout) root.findViewById( R.id.rootRecoveryPassword);
            stps_backgroundToolbar = (Toolbar) root.findViewById( R.id.stps_backgroundToolbar);
            verifyPassword_rippleOk = (RippleView) root.findViewById( R.id.verifyPassword_rippleOk);
            ripple_back = (RippleView) root.findViewById( R.id.ripple_back);
            rootRecoveryQuestionPassword = (LinearLayout) root.findViewById( R.id.rootRecoveryQuestionPassword);
            txtSetRecoveryQuestionPassOne = (TextView) root.findViewById( R.id.txtSetRecoveryQuestionPassOne);
            edtSetRecoveryAnswerPassOne = (MEditText) root.findViewById( R.id.edtSetRecoveryAnswerPassOne);
            txtSetRecoveryQuestionPassTwo = (TextView) root.findViewById( R.id.txtSetRecoveryQuestionPassTwo);
            edtSetRecoveryAnswerPassTwo = (MEditText) root.findViewById( R.id.edtSetRecoveryAnswerPassTwo);
            txtSetRecoveryByEmail = (TextView) root.findViewById( R.id.txtSetRecoveryByEmail);
            rootRecoveryEmailPassword = (LinearLayout) root.findViewById( R.id.rootRecoveryEmailPassword);
            edtSetRecoveryEmail = (MEditText) root.findViewById( R.id.edtSetRecoveryEmail);
            txtResendConfirmEmail = (TextView) root.findViewById( R.id.txtResendConfirmEmail);
            txtSetRecoveryByQuestion = (TextView) root.findViewById( R.id.txtSetRecoveryByQuestion);
        }

        public FragmentSecurityRecovery(Context context) {
            this(context ,null);
        }

        public FragmentSecurityRecovery(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.fragment_security_recovery;
            public static int rootRecoveryPassword = R.id.rootRecoveryPassword;
            public static int stps_backgroundToolbar = R.id.stps_backgroundToolbar;
            public static int verifyPassword_rippleOk = R.id.verifyPassword_rippleOk;
            public static int ripple_back = R.id.ripple_back;
            public static int rootRecoveryQuestionPassword = R.id.rootRecoveryQuestionPassword;
            public static int txtSetRecoveryQuestionPassOne = R.id.txtSetRecoveryQuestionPassOne;
            public static int edtSetRecoveryAnswerPassOne = R.id.edtSetRecoveryAnswerPassOne;
            public static int txtSetRecoveryQuestionPassTwo = R.id.txtSetRecoveryQuestionPassTwo;
            public static int edtSetRecoveryAnswerPassTwo = R.id.edtSetRecoveryAnswerPassTwo;
            public static int txtSetRecoveryByEmail = R.id.txtSetRecoveryByEmail;
            public static int rootRecoveryEmailPassword = R.id.rootRecoveryEmailPassword;
            public static int edtSetRecoveryEmail = R.id.edtSetRecoveryEmail;
            public static int txtResendConfirmEmail = R.id.txtResendConfirmEmail;
            public static int txtSetRecoveryByQuestion = R.id.txtSetRecoveryByQuestion;
        }
    }

    public static class FragmentSetSecurityPassword {
        public LinearLayout root;
        public LinearLayout rootSetPasswordSecurity;
        public Toolbar stps_backgroundToolbar;
        public RippleView setPassword_rippleOk;
        public RippleView setPassword_ripple_back;
        public TextView setPassword_toolbar;
        public LinearLayout rootEnterPassword;
        public MEditText setPassword_edtSetPassword;
        public LinearLayout rootReEnterPassword;
        public MEditText setPassword_edtSetRePassword;
        public LinearLayout rootHintPassword;
        public MEditText edtSetHintPassword;
        public LinearLayout rootQuestionPassword;
        public MEditText edtSetQuestionPassOne;
        public MEditText edtSetAnswerPassOne;
        public MEditText edtSetQuestionPassTwo;
        public MEditText edtSetAnswerPassTwo;
        public LinearLayout rootEmail;
        public MEditText edtSetEmail;
        public TextView txtSkipSetEmail;
        public LinearLayout rootConfirmEmail;
        public MEditText edtSetConfirmEmail;
        public TextView txtResendConfirmEmail;
        public TextView txtSkipConfirmEmail;

        public FragmentSetSecurityPassword(Context context,ViewGroup parent) {
            this(context,parent, R.layout.fragment_set_security_password );
        }

        public FragmentSetSecurityPassword(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            rootSetPasswordSecurity = (LinearLayout) root.findViewById( R.id.rootSetPasswordSecurity);
            stps_backgroundToolbar = (Toolbar) root.findViewById( R.id.stps_backgroundToolbar);
            setPassword_rippleOk = (RippleView) root.findViewById( R.id.setPassword_rippleOk);
            setPassword_ripple_back = (RippleView) root.findViewById( R.id.setPassword_ripple_back);
            setPassword_toolbar = (TextView) root.findViewById( R.id.setPassword_toolbar);
            rootEnterPassword = (LinearLayout) root.findViewById( R.id.rootEnterPassword);
            setPassword_edtSetPassword = (MEditText) root.findViewById( R.id.setPassword_edtSetPassword);
            rootReEnterPassword = (LinearLayout) root.findViewById( R.id.rootReEnterPassword);
            setPassword_edtSetRePassword = (MEditText) root.findViewById( R.id.setPassword_edtSetRePassword);
            rootHintPassword = (LinearLayout) root.findViewById( R.id.rootHintPassword);
            edtSetHintPassword = (MEditText) root.findViewById( R.id.edtSetHintPassword);
            rootQuestionPassword = (LinearLayout) root.findViewById( R.id.rootQuestionPassword);
            edtSetQuestionPassOne = (MEditText) root.findViewById( R.id.edtSetQuestionPassOne);
            edtSetAnswerPassOne = (MEditText) root.findViewById( R.id.edtSetAnswerPassOne);
            edtSetQuestionPassTwo = (MEditText) root.findViewById( R.id.edtSetQuestionPassTwo);
            edtSetAnswerPassTwo = (MEditText) root.findViewById( R.id.edtSetAnswerPassTwo);
            rootEmail = (LinearLayout) root.findViewById( R.id.rootEmail);
            edtSetEmail = (MEditText) root.findViewById( R.id.edtSetEmail);
            txtSkipSetEmail = (TextView) root.findViewById( R.id.txtSkipSetEmail);
            rootConfirmEmail = (LinearLayout) root.findViewById( R.id.rootConfirmEmail);
            edtSetConfirmEmail = (MEditText) root.findViewById( R.id.edtSetConfirmEmail);
            txtResendConfirmEmail = (TextView) root.findViewById( R.id.txtResendConfirmEmail);
            txtSkipConfirmEmail = (TextView) root.findViewById( R.id.txtSkipConfirmEmail);
        }

        public FragmentSetSecurityPassword(Context context) {
            this(context ,null);
        }

        public FragmentSetSecurityPassword(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.fragment_set_security_password;
            public static int rootSetPasswordSecurity = R.id.rootSetPasswordSecurity;
            public static int stps_backgroundToolbar = R.id.stps_backgroundToolbar;
            public static int setPassword_rippleOk = R.id.setPassword_rippleOk;
            public static int setPassword_ripple_back = R.id.setPassword_ripple_back;
            public static int setPassword_toolbar = R.id.setPassword_toolbar;
            public static int rootEnterPassword = R.id.rootEnterPassword;
            public static int setPassword_edtSetPassword = R.id.setPassword_edtSetPassword;
            public static int rootReEnterPassword = R.id.rootReEnterPassword;
            public static int setPassword_edtSetRePassword = R.id.setPassword_edtSetRePassword;
            public static int rootHintPassword = R.id.rootHintPassword;
            public static int edtSetHintPassword = R.id.edtSetHintPassword;
            public static int rootQuestionPassword = R.id.rootQuestionPassword;
            public static int edtSetQuestionPassOne = R.id.edtSetQuestionPassOne;
            public static int edtSetAnswerPassOne = R.id.edtSetAnswerPassOne;
            public static int edtSetQuestionPassTwo = R.id.edtSetQuestionPassTwo;
            public static int edtSetAnswerPassTwo = R.id.edtSetAnswerPassTwo;
            public static int rootEmail = R.id.rootEmail;
            public static int edtSetEmail = R.id.edtSetEmail;
            public static int txtSkipSetEmail = R.id.txtSkipSetEmail;
            public static int rootConfirmEmail = R.id.rootConfirmEmail;
            public static int edtSetConfirmEmail = R.id.edtSetConfirmEmail;
            public static int txtResendConfirmEmail = R.id.txtResendConfirmEmail;
            public static int txtSkipConfirmEmail = R.id.txtSkipConfirmEmail;
        }
    }

    public static class FragmentShowImageMessages {
        public RelativeLayout root;
        public RecyclerView recyclerView;
        public LinearLayout toolbar;
        public RippleView back;
        public TextView count;
        public RippleView menu;
        public TextView fileName;
        public TextView messageTime;

        public FragmentShowImageMessages(Context context,ViewGroup parent) {
            this(context,parent, R.layout.fragment_show_image_messages );
        }

        public FragmentShowImageMessages(Context context,ViewGroup parent, int layout) {
            root = (RelativeLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            recyclerView = (RecyclerView) root.findViewById( R.id.recyclerView);
            toolbar = (LinearLayout) root.findViewById( R.id.toolbar);
            back = (RippleView) root.findViewById( R.id.back);
            count = (TextView) root.findViewById( R.id.count);
            menu = (RippleView) root.findViewById( R.id.menu);
            fileName = (TextView) root.findViewById( R.id.fileName);
            messageTime = (TextView) root.findViewById( R.id.messageTime);
        }

        public FragmentShowImageMessages(Context context) {
            this(context ,null);
        }

        public FragmentShowImageMessages(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.fragment_show_image_messages;
            public static int recyclerView = R.id.recyclerView;
            public static int toolbar = R.id.toolbar;
            public static int back = R.id.back;
            public static int count = R.id.count;
            public static int menu = R.id.menu;
            public static int fileName = R.id.fileName;
            public static int messageTime = R.id.messageTime;
        }
    }

    public static class FragmentShowMember {
        public LinearLayout root;
        public LinearLayout rootShowMember;
        public LinearLayout fcg_ll_toolbar;
        public RippleView fcg_ripple_back;
        public MaterialDesignTextView fcg_btn_back;
        public TextView member_txt_titleToolbar;
        public RippleView member_edtSearch;
        public MaterialDesignTextView member_btn_search;
        public MEditText menu_edt_search;
        public RippleView menu_ripple_search;
        public MaterialDesignTextView menu_btn_close;
        public RecyclerView fcm_recycler_view_show_member;
        public ProgressBar fcg_prgWaiting;

        public FragmentShowMember(Context context,ViewGroup parent) {
            this(context,parent, R.layout.fragment_show_member );
        }

        public FragmentShowMember(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            rootShowMember = (LinearLayout) root.findViewById( R.id.rootShowMember);
            fcg_ll_toolbar = (LinearLayout) root.findViewById( R.id.fcg_ll_toolbar);
            fcg_ripple_back = (RippleView) root.findViewById( R.id.fcg_ripple_back);
            fcg_btn_back = (MaterialDesignTextView) root.findViewById( R.id.fcg_btn_back);
            member_txt_titleToolbar = (TextView) root.findViewById( R.id.member_txt_titleToolbar);
            member_edtSearch = (RippleView) root.findViewById( R.id.member_edtSearch);
            member_btn_search = (MaterialDesignTextView) root.findViewById( R.id.member_btn_search);
            menu_edt_search = (MEditText) root.findViewById( R.id.menu_edt_search);
            menu_ripple_search = (RippleView) root.findViewById( R.id.menu_ripple_search);
            menu_btn_close = (MaterialDesignTextView) root.findViewById( R.id.menu_btn_close);
            fcm_recycler_view_show_member = (RecyclerView) root.findViewById( R.id.fcm_recycler_view_show_member);
            fcg_prgWaiting = (ProgressBar) root.findViewById( R.id.fcg_prgWaiting);
        }

        public FragmentShowMember(Context context) {
            this(context ,null);
        }

        public FragmentShowMember(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.fragment_show_member;
            public static int rootShowMember = R.id.rootShowMember;
            public static int fcg_ll_toolbar = R.id.fcg_ll_toolbar;
            public static int fcg_ripple_back = R.id.fcg_ripple_back;
            public static int fcg_btn_back = R.id.fcg_btn_back;
            public static int member_txt_titleToolbar = R.id.member_txt_titleToolbar;
            public static int member_edtSearch = R.id.member_edtSearch;
            public static int member_btn_search = R.id.member_btn_search;
            public static int menu_edt_search = R.id.menu_edt_search;
            public static int menu_ripple_search = R.id.menu_ripple_search;
            public static int menu_btn_close = R.id.menu_btn_close;
            public static int fcm_recycler_view_show_member = R.id.fcm_recycler_view_show_member;
            public static int fcg_prgWaiting = R.id.fcg_prgWaiting;
        }
    }

    public static class FragmentVideoTrime {
        public RelativeLayout root;
        public Toolbar toolbar_VideoTrim;
        public SearchView stfaq_searchView;
        public LinearLayout stfaq_allLayout_toolbar;
        public RippleView pu_ripple_back;
        public MaterialDesignTextView pu_txt_agreeImage;
        public TextView stfaq_txt_titleToolbar;
        public TextView stfaq_txt_detail;
        public TextView stfaq_txt_time;
        public TextView stfaq_txt_size;
        public K4LVideoTrimmer timeLine;

        public FragmentVideoTrime(Context context,ViewGroup parent) {
            this(context,parent, R.layout.fragment_video_trime );
        }

        public FragmentVideoTrime(Context context,ViewGroup parent, int layout) {
            root = (RelativeLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            toolbar_VideoTrim = (Toolbar) root.findViewById( R.id.toolbar_VideoTrim);
            stfaq_searchView = (SearchView) root.findViewById( R.id.stfaq_searchView);
            stfaq_allLayout_toolbar = (LinearLayout) root.findViewById( R.id.stfaq_allLayout_toolbar);
            pu_ripple_back = (RippleView) root.findViewById( R.id.pu_ripple_back);
            pu_txt_agreeImage = (MaterialDesignTextView) root.findViewById( R.id.pu_txt_agreeImage);
            stfaq_txt_titleToolbar = (TextView) root.findViewById( R.id.stfaq_txt_titleToolbar);
            stfaq_txt_detail = (TextView) root.findViewById( R.id.stfaq_txt_detail);
            stfaq_txt_time = (TextView) root.findViewById( R.id.stfaq_txt_time);
            stfaq_txt_size = (TextView) root.findViewById( R.id.stfaq_txt_size);
            timeLine = (K4LVideoTrimmer) root.findViewById( R.id.timeLine);
        }

        public FragmentVideoTrime(Context context) {
            this(context ,null);
        }

        public FragmentVideoTrime(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.fragment_video_trime;
            public static int toolbar_VideoTrim = R.id.toolbar_VideoTrim;
            public static int stfaq_searchView = R.id.stfaq_searchView;
            public static int stfaq_allLayout_toolbar = R.id.stfaq_allLayout_toolbar;
            public static int pu_ripple_back = R.id.pu_ripple_back;
            public static int pu_txt_agreeImage = R.id.pu_txt_agreeImage;
            public static int stfaq_txt_titleToolbar = R.id.stfaq_txt_titleToolbar;
            public static int stfaq_txt_detail = R.id.stfaq_txt_detail;
            public static int stfaq_txt_time = R.id.stfaq_txt_time;
            public static int stfaq_txt_size = R.id.stfaq_txt_size;
            public static int timeLine = R.id.timeLine;
        }
    }

    public static class LayoutAttachFile {
        public LinearLayout root;
        public LinearLayout chl_ll_attach;
        public MaterialDesignTextView chl_imv_smile_button;
        public EmojiEditTextE chl_edt_chat;
        public MaterialDesignTextView chl_imv_send_button;
        public LinearLayout layoutAttachBottom;
        public MaterialDesignTextView chl_imv_attach_button;
        public MaterialDesignTextView chl_imv_mic_button;

        public LayoutAttachFile(Context context,ViewGroup parent) {
            this(context,parent, R.layout.layout_attach_file );
        }

        public LayoutAttachFile(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            chl_ll_attach = (LinearLayout) root.findViewById( R.id.chl_ll_attach);
            chl_imv_smile_button = (MaterialDesignTextView) root.findViewById( R.id.chl_imv_smile_button);
            chl_edt_chat = (EmojiEditTextE) root.findViewById( R.id.chl_edt_chat);
            chl_imv_send_button = (MaterialDesignTextView) root.findViewById( R.id.chl_imv_send_button);
            layoutAttachBottom = (LinearLayout) root.findViewById( R.id.layoutAttachBottom);
            chl_imv_attach_button = (MaterialDesignTextView) root.findViewById( R.id.chl_imv_attach_button);
            chl_imv_mic_button = (MaterialDesignTextView) root.findViewById( R.id.chl_imv_mic_button);
        }

        public LayoutAttachFile(Context context) {
            this(context ,null);
        }

        public LayoutAttachFile(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.layout_attach_file;
            public static int chl_ll_attach = R.id.chl_ll_attach;
            public static int chl_imv_smile_button = R.id.chl_imv_smile_button;
            public static int chl_edt_chat = R.id.chl_edt_chat;
            public static int chl_imv_send_button = R.id.chl_imv_send_button;
            public static int layoutAttachBottom = R.id.layoutAttachBottom;
            public static int chl_imv_attach_button = R.id.chl_imv_attach_button;
            public static int chl_imv_mic_button = R.id.chl_imv_mic_button;
        }
    }

    public static class LayoutChatReply {
        public LinearLayout root;
        public LinearLayout replayLayoutAboveEditText;
        public ImageView lcr_imv_replay;
        public ImageView thumbnail;
        public EmojiTextViewE replyFrom;
        public EmojiTextViewE replayTo;
        public MaterialDesignTextView cancelIcon;

        public LayoutChatReply(Context context,ViewGroup parent) {
            this(context,parent, R.layout.layout_chat_reply );
        }

        public LayoutChatReply(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            replayLayoutAboveEditText = (LinearLayout) root.findViewById( R.id.replayLayoutAboveEditText);
            lcr_imv_replay = (ImageView) root.findViewById( R.id.lcr_imv_replay);
            thumbnail = (ImageView) root.findViewById( R.id.thumbnail);
            replyFrom = (EmojiTextViewE) root.findViewById( R.id.replyFrom);
            replayTo = (EmojiTextViewE) root.findViewById( R.id.replayTo);
            cancelIcon = (MaterialDesignTextView) root.findViewById( R.id.cancelIcon);
        }

        public LayoutChatReply(Context context) {
            this(context ,null);
        }

        public LayoutChatReply(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.layout_chat_reply;
            public static int replayLayoutAboveEditText = R.id.replayLayoutAboveEditText;
            public static int lcr_imv_replay = R.id.lcr_imv_replay;
            public static int thumbnail = R.id.thumbnail;
            public static int replyFrom = R.id.replyFrom;
            public static int replayTo = R.id.replayTo;
            public static int cancelIcon = R.id.cancelIcon;
        }
    }

    public static class LayoutMenu {
        public LinearLayout root;
        public LinearLayout rootMenu;
        public ScrollView scrollView;
        public LinearLayout lm_layout_header;
        public LinearLayout lm_layout_user_picture;
        public CircleImageView lm_imv_user_picture;
        public EmojiTextViewE lm_txt_user_name;
        public TextView lm_txt_phone_number;
        public MaterialDesignTextView lm_txt_cloud;
        public LinearLayout lm_ll_new_chat;
        public MaterialDesignTextView lm_txt_icon_new_chat;
        public TextView textView6;
        public LinearLayout lm_ll_new_group;
        public MaterialDesignTextView lm_txt_icon_group;
        public TextView textView9;
        public LinearLayout lm_ll_new_channle;
        public TextView lm_txt_icon_channel;
        public LinearLayout lm_ll_igap_search;
        public MaterialDesignTextView amr_btn_search;
        public TextView textView4;
        public LinearLayout lm_ll_contacts;
        public MaterialDesignTextView lm_txt_icon_contacts;
        public LinearLayout lm_ll_setting;
        public MaterialDesignTextView lm_txt_icon_setting;
        public LinearLayout lm_ll_map;
        public LinearLayout lm_ll_call;
        public LinearLayout lm_ll_qrCode;
        public MaterialDesignTextView lm_txt_icon_qrCode;
        public LinearLayout lm_ll_invite_friends;
        public MaterialDesignTextView lm_txt_icon_invite_friends;
        public TextView textView2;
        public LinearLayout lm_ll_igap_faq;
        public MaterialDesignTextView lm_txt_icon_igap_faq;
        public TextView textView3;

        public LayoutMenu(Context context,ViewGroup parent) {
            this(context,parent, R.layout.layout_menu );
        }

        public LayoutMenu(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            rootMenu = (LinearLayout) root.findViewById( R.id.rootMenu);
            scrollView = (ScrollView) root.findViewById( R.id.scrollView);
            lm_layout_header = (LinearLayout) root.findViewById( R.id.lm_layout_header);
            lm_layout_user_picture = (LinearLayout) root.findViewById( R.id.lm_layout_user_picture);
            lm_imv_user_picture = (CircleImageView) root.findViewById( R.id.lm_imv_user_picture);
            lm_txt_user_name = (EmojiTextViewE) root.findViewById( R.id.lm_txt_user_name);
            lm_txt_phone_number = (TextView) root.findViewById( R.id.lm_txt_phone_number);
            lm_txt_cloud = (MaterialDesignTextView) root.findViewById( R.id.lm_txt_cloud);
            lm_ll_new_chat = (LinearLayout) root.findViewById( R.id.lm_ll_new_chat);
            lm_txt_icon_new_chat = (MaterialDesignTextView) root.findViewById( R.id.lm_txt_icon_new_chat);
            textView6 = (TextView) root.findViewById( R.id.textView6);
            lm_ll_new_group = (LinearLayout) root.findViewById( R.id.lm_ll_new_group);
            lm_txt_icon_group = (MaterialDesignTextView) root.findViewById( R.id.lm_txt_icon_group);
            textView9 = (TextView) root.findViewById( R.id.textView9);
            lm_ll_new_channle = (LinearLayout) root.findViewById( R.id.lm_ll_new_channle);
            lm_txt_icon_channel = (TextView) root.findViewById( R.id.lm_txt_icon_channel);
            lm_ll_igap_search = (LinearLayout) root.findViewById( R.id.lm_ll_igap_search);
            amr_btn_search = (MaterialDesignTextView) root.findViewById( R.id.amr_btn_search);
            textView4 = (TextView) root.findViewById( R.id.textView4);
            lm_ll_contacts = (LinearLayout) root.findViewById( R.id.lm_ll_contacts);
            lm_txt_icon_contacts = (MaterialDesignTextView) root.findViewById( R.id.lm_txt_icon_contacts);
            lm_ll_setting = (LinearLayout) root.findViewById( R.id.lm_ll_setting);
            lm_txt_icon_setting = (MaterialDesignTextView) root.findViewById( R.id.lm_txt_icon_setting);
            lm_ll_map = (LinearLayout) root.findViewById( R.id.lm_ll_map);
            lm_ll_call = (LinearLayout) root.findViewById( R.id.lm_ll_call);
            lm_ll_qrCode = (LinearLayout) root.findViewById( R.id.lm_ll_qrCode);
            lm_txt_icon_qrCode = (MaterialDesignTextView) root.findViewById( R.id.lm_txt_icon_qrCode);
            lm_ll_invite_friends = (LinearLayout) root.findViewById( R.id.lm_ll_invite_friends);
            lm_txt_icon_invite_friends = (MaterialDesignTextView) root.findViewById( R.id.lm_txt_icon_invite_friends);
            textView2 = (TextView) root.findViewById( R.id.textView2);
            lm_ll_igap_faq = (LinearLayout) root.findViewById( R.id.lm_ll_igap_faq);
            lm_txt_icon_igap_faq = (MaterialDesignTextView) root.findViewById( R.id.lm_txt_icon_igap_faq);
            textView3 = (TextView) root.findViewById( R.id.textView3);
        }

        public LayoutMenu(Context context) {
            this(context ,null);
        }

        public LayoutMenu(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.layout_menu;
            public static int rootMenu = R.id.rootMenu;
            public static int scrollView = R.id.scrollView;
            public static int lm_layout_header = R.id.lm_layout_header;
            public static int lm_layout_user_picture = R.id.lm_layout_user_picture;
            public static int lm_imv_user_picture = R.id.lm_imv_user_picture;
            public static int lm_txt_user_name = R.id.lm_txt_user_name;
            public static int lm_txt_phone_number = R.id.lm_txt_phone_number;
            public static int lm_txt_cloud = R.id.lm_txt_cloud;
            public static int lm_ll_new_chat = R.id.lm_ll_new_chat;
            public static int lm_txt_icon_new_chat = R.id.lm_txt_icon_new_chat;
            public static int textView6 = R.id.textView6;
            public static int lm_ll_new_group = R.id.lm_ll_new_group;
            public static int lm_txt_icon_group = R.id.lm_txt_icon_group;
            public static int textView9 = R.id.textView9;
            public static int lm_ll_new_channle = R.id.lm_ll_new_channle;
            public static int lm_txt_icon_channel = R.id.lm_txt_icon_channel;
            public static int lm_ll_igap_search = R.id.lm_ll_igap_search;
            public static int amr_btn_search = R.id.amr_btn_search;
            public static int textView4 = R.id.textView4;
            public static int lm_ll_contacts = R.id.lm_ll_contacts;
            public static int lm_txt_icon_contacts = R.id.lm_txt_icon_contacts;
            public static int lm_ll_setting = R.id.lm_ll_setting;
            public static int lm_txt_icon_setting = R.id.lm_txt_icon_setting;
            public static int lm_ll_map = R.id.lm_ll_map;
            public static int lm_ll_call = R.id.lm_ll_call;
            public static int lm_ll_qrCode = R.id.lm_ll_qrCode;
            public static int lm_txt_icon_qrCode = R.id.lm_txt_icon_qrCode;
            public static int lm_ll_invite_friends = R.id.lm_ll_invite_friends;
            public static int lm_txt_icon_invite_friends = R.id.lm_txt_icon_invite_friends;
            public static int textView2 = R.id.textView2;
            public static int lm_ll_igap_faq = R.id.lm_ll_igap_faq;
            public static int lm_txt_icon_igap_faq = R.id.lm_txt_icon_igap_faq;
            public static int textView3 = R.id.textView3;
        }
    }

    public static class LayoutMicRecord {
        public LinearLayout root;
        public ImageView img_pic_record;
        public TextView txt_time_record;
        public TextView txt_time_mili_secend;
        public TextView txt_slideto_cancel;
        public LinearLayout lmr_layout_mic;
        public MaterialDesignTextView lmr_txt_Lock;
        public MaterialDesignTextView lmr_btn_mic_layout;

        public LayoutMicRecord(Context context,ViewGroup parent) {
            this(context,parent, R.layout.layout_mic_record );
        }

        public LayoutMicRecord(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            img_pic_record = (ImageView) root.findViewById( R.id.img_pic_record);
            txt_time_record = (TextView) root.findViewById( R.id.txt_time_record);
            txt_time_mili_secend = (TextView) root.findViewById( R.id.txt_time_mili_secend);
            txt_slideto_cancel = (TextView) root.findViewById( R.id.txt_slideto_cancel);
            lmr_layout_mic = (LinearLayout) root.findViewById( R.id.lmr_layout_mic);
            lmr_txt_Lock = (MaterialDesignTextView) root.findViewById( R.id.lmr_txt_Lock);
            lmr_btn_mic_layout = (MaterialDesignTextView) root.findViewById( R.id.lmr_btn_mic_layout);
        }

        public LayoutMicRecord(Context context) {
            this(context ,null);
        }

        public LayoutMicRecord(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.layout_mic_record;
            public static int img_pic_record = R.id.img_pic_record;
            public static int txt_time_record = R.id.txt_time_record;
            public static int txt_time_mili_secend = R.id.txt_time_mili_secend;
            public static int txt_slideto_cancel = R.id.txt_slideto_cancel;
            public static int lmr_layout_mic = R.id.lmr_layout_mic;
            public static int lmr_txt_Lock = R.id.lmr_txt_Lock;
            public static int lmr_btn_mic_layout = R.id.lmr_btn_mic_layout;
        }
    }

    public static class LayoutNotification {
        public LinearLayout root;
        public LinearLayout ln_ll_message_a;
        public TextView ln_txt_a1;
        public TextView ln_txt_a2;
        public TextView ln_txt_a3;
        public LinearLayout ln_ll_message_b;
        public TextView ln_txt_b1;
        public TextView ln_txt_b2;
        public TextView ln_txt_b3;
        public LinearLayout ln_ll_message_c;
        public TextView ln_txt_c1;
        public TextView ln_txt_c2;
        public TextView ln_txt_c3;
        public LinearLayout ln_ll_message_d;
        public TextView ln_txt_d1;
        public TextView ln_txt_d2;
        public TextView ln_txt_d3;
        public TextView ln_txt_more;
        public ImageView mln_btn_replay;
        public TextView ln_txt_replay;
        public TextView ln_txt_unread_message;
        public ImageView mln_btn_close;

        public LayoutNotification(Context context,ViewGroup parent) {
            this(context,parent, R.layout.layout_notification );
        }

        public LayoutNotification(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            ln_ll_message_a = (LinearLayout) root.findViewById( R.id.ln_ll_message_a);
            ln_txt_a1 = (TextView) root.findViewById( R.id.ln_txt_a1);
            ln_txt_a2 = (TextView) root.findViewById( R.id.ln_txt_a2);
            ln_txt_a3 = (TextView) root.findViewById( R.id.ln_txt_a3);
            ln_ll_message_b = (LinearLayout) root.findViewById( R.id.ln_ll_message_b);
            ln_txt_b1 = (TextView) root.findViewById( R.id.ln_txt_b1);
            ln_txt_b2 = (TextView) root.findViewById( R.id.ln_txt_b2);
            ln_txt_b3 = (TextView) root.findViewById( R.id.ln_txt_b3);
            ln_ll_message_c = (LinearLayout) root.findViewById( R.id.ln_ll_message_c);
            ln_txt_c1 = (TextView) root.findViewById( R.id.ln_txt_c1);
            ln_txt_c2 = (TextView) root.findViewById( R.id.ln_txt_c2);
            ln_txt_c3 = (TextView) root.findViewById( R.id.ln_txt_c3);
            ln_ll_message_d = (LinearLayout) root.findViewById( R.id.ln_ll_message_d);
            ln_txt_d1 = (TextView) root.findViewById( R.id.ln_txt_d1);
            ln_txt_d2 = (TextView) root.findViewById( R.id.ln_txt_d2);
            ln_txt_d3 = (TextView) root.findViewById( R.id.ln_txt_d3);
            ln_txt_more = (TextView) root.findViewById( R.id.ln_txt_more);
            mln_btn_replay = (ImageView) root.findViewById( R.id.mln_btn_replay);
            ln_txt_replay = (TextView) root.findViewById( R.id.ln_txt_replay);
            ln_txt_unread_message = (TextView) root.findViewById( R.id.ln_txt_unread_message);
            mln_btn_close = (ImageView) root.findViewById( R.id.mln_btn_close);
        }

        public LayoutNotification(Context context) {
            this(context ,null);
        }

        public LayoutNotification(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.layout_notification;
            public static int ln_ll_message_a = R.id.ln_ll_message_a;
            public static int ln_txt_a1 = R.id.ln_txt_a1;
            public static int ln_txt_a2 = R.id.ln_txt_a2;
            public static int ln_txt_a3 = R.id.ln_txt_a3;
            public static int ln_ll_message_b = R.id.ln_ll_message_b;
            public static int ln_txt_b1 = R.id.ln_txt_b1;
            public static int ln_txt_b2 = R.id.ln_txt_b2;
            public static int ln_txt_b3 = R.id.ln_txt_b3;
            public static int ln_ll_message_c = R.id.ln_ll_message_c;
            public static int ln_txt_c1 = R.id.ln_txt_c1;
            public static int ln_txt_c2 = R.id.ln_txt_c2;
            public static int ln_txt_c3 = R.id.ln_txt_c3;
            public static int ln_ll_message_d = R.id.ln_ll_message_d;
            public static int ln_txt_d1 = R.id.ln_txt_d1;
            public static int ln_txt_d2 = R.id.ln_txt_d2;
            public static int ln_txt_d3 = R.id.ln_txt_d3;
            public static int ln_txt_more = R.id.ln_txt_more;
            public static int mln_btn_replay = R.id.mln_btn_replay;
            public static int ln_txt_replay = R.id.ln_txt_replay;
            public static int ln_txt_unread_message = R.id.ln_txt_unread_message;
            public static int mln_btn_close = R.id.mln_btn_close;
        }
    }

    public static class LayoutNotificationSmall {
        public LinearLayout root;
        public ImageView ln_imv_avatar_notification;
        public TextView ln_txt_header;
        public TextView ln_txt_time;
        public TextView ln_txt_message_notification;

        public LayoutNotificationSmall(Context context,ViewGroup parent) {
            this(context,parent, R.layout.layout_notification_small );
        }

        public LayoutNotificationSmall(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            ln_imv_avatar_notification = (ImageView) root.findViewById( R.id.ln_imv_avatar_notification);
            ln_txt_header = (TextView) root.findViewById( R.id.ln_txt_header);
            ln_txt_time = (TextView) root.findViewById( R.id.ln_txt_time);
            ln_txt_message_notification = (TextView) root.findViewById( R.id.ln_txt_message_notification);
        }

        public LayoutNotificationSmall(Context context) {
            this(context ,null);
        }

        public LayoutNotificationSmall(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.layout_notification_small;
            public static int ln_imv_avatar_notification = R.id.ln_imv_avatar_notification;
            public static int ln_txt_header = R.id.ln_txt_header;
            public static int ln_txt_time = R.id.ln_txt_time;
            public static int ln_txt_message_notification = R.id.ln_txt_message_notification;
        }
    }

    public static class MapFragment {
        public LinearLayout root;
        public FrameLayout mf_fragment_map_view;
        public Button mf_btn_send_position;

        public MapFragment(Context context,ViewGroup parent) {
            this(context,parent, R.layout.map_fragment );
        }

        public MapFragment(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            mf_fragment_map_view = (FrameLayout) root.findViewById( R.id.mf_fragment_map_view);
            mf_btn_send_position = (Button) root.findViewById( R.id.mf_btn_send_position);
        }

        public MapFragment(Context context) {
            this(context ,null);
        }

        public MapFragment(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.map_fragment;
            public static int mf_fragment_map_view = R.id.mf_fragment_map_view;
            public static int mf_btn_send_position = R.id.mf_btn_send_position;
        }
    }

    public static class MapUserInfo {
        public LinearLayout root;
        public MaterialDesignTextView txt_info_back_map;
        public MaterialDesignTextView txt_close_map;
        public MaterialDesignTextView txt_chat_map;
        public MaterialDesignTextView txt_call_map;
        public MaterialDesignTextView txt_name_info_map;
        public MaterialDesignTextView txt_open_comment_map;
        public TextView txt_info_comment;
        public CircleImageView img_info_avatar_map;

        public MapUserInfo(Context context,ViewGroup parent) {
            this(context,parent, R.layout.map_user_info );
        }

        public MapUserInfo(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            txt_info_back_map = (MaterialDesignTextView) root.findViewById( R.id.txt_info_back_map);
            txt_close_map = (MaterialDesignTextView) root.findViewById( R.id.txt_close_map);
            txt_chat_map = (MaterialDesignTextView) root.findViewById( R.id.txt_chat_map);
            txt_call_map = (MaterialDesignTextView) root.findViewById( R.id.txt_call_map);
            txt_name_info_map = (MaterialDesignTextView) root.findViewById( R.id.txt_name_info_map);
            txt_open_comment_map = (MaterialDesignTextView) root.findViewById( R.id.txt_open_comment_map);
            txt_info_comment = (TextView) root.findViewById( R.id.txt_info_comment);
            img_info_avatar_map = (CircleImageView) root.findViewById( R.id.img_info_avatar_map);
        }

        public MapUserInfo(Context context) {
            this(context ,null);
        }

        public MapUserInfo(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.map_user_info;
            public static int txt_info_back_map = R.id.txt_info_back_map;
            public static int txt_close_map = R.id.txt_close_map;
            public static int txt_chat_map = R.id.txt_chat_map;
            public static int txt_call_map = R.id.txt_call_map;
            public static int txt_name_info_map = R.id.txt_name_info_map;
            public static int txt_open_comment_map = R.id.txt_open_comment_map;
            public static int txt_info_comment = R.id.txt_info_comment;
            public static int img_info_avatar_map = R.id.img_info_avatar_map;
        }
    }

    public static class MapUserItem {
        public LinearLayout root;
        public LinearLayout lyt_map_user;
        public CircleImageView img_user_avatar_map;
        public LinearLayout layout_user_name_map;
        public CustomTextViewMedium txt_user_name_map;
        public CustomTextViewMedium txt_user_distance_map;
        public CustomTextViewMedium txt_user_comment_map;
        public MaterialDesignTextView txt_arrow_list_map;
        public View view_topLine_map;

        public MapUserItem(Context context,ViewGroup parent) {
            this(context,parent, R.layout.map_user_item );
        }

        public MapUserItem(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            lyt_map_user = (LinearLayout) root.findViewById( R.id.lyt_map_user);
            img_user_avatar_map = (CircleImageView) root.findViewById( R.id.img_user_avatar_map);
            layout_user_name_map = (LinearLayout) root.findViewById( R.id.layout_user_name_map);
            txt_user_name_map = (CustomTextViewMedium) root.findViewById( R.id.txt_user_name_map);
            txt_user_distance_map = (CustomTextViewMedium) root.findViewById( R.id.txt_user_distance_map);
            txt_user_comment_map = (CustomTextViewMedium) root.findViewById( R.id.txt_user_comment_map);
            txt_arrow_list_map = (MaterialDesignTextView) root.findViewById( R.id.txt_arrow_list_map);
            view_topLine_map = (View) root.findViewById( R.id.view_topLine_map);
        }

        public MapUserItem(Context context) {
            this(context ,null);
        }

        public MapUserItem(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.map_user_item;
            public static int lyt_map_user = R.id.lyt_map_user;
            public static int img_user_avatar_map = R.id.img_user_avatar_map;
            public static int layout_user_name_map = R.id.layout_user_name_map;
            public static int txt_user_name_map = R.id.txt_user_name_map;
            public static int txt_user_distance_map = R.id.txt_user_distance_map;
            public static int txt_user_comment_map = R.id.txt_user_comment_map;
            public static int txt_arrow_list_map = R.id.txt_arrow_list_map;
            public static int view_topLine_map = R.id.view_topLine_map;
        }
    }

    public static class MsgProgressItem {
        public MessageProgress root;
        public MessageProgress progress;

        public MsgProgressItem(Context context,ViewGroup parent) {
            this(context,parent, R.layout.msg_progress_item );
        }

        public MsgProgressItem(Context context,ViewGroup parent, int layout) {
            root = (MessageProgress) LayoutInflater.from(context).inflate(layout,parent ,false);
            progress = (MessageProgress) root.findViewById( R.id.progress);
        }

        public MsgProgressItem(Context context) {
            this(context ,null);
        }

        public MsgProgressItem(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.msg_progress_item;
            public static int progress = R.id.progress;
        }
    }

    public static class MusicLayoutNotification {
        public LinearLayout root;
        public ImageView mln_img_picture_music;
        public TextView mln_txt_music_name;
        public TextView mln_txt_music_outher;
        public ImageView mln_btn_Previous_music;
        public ImageView mln_btn_play_music;
        public ImageView mln_btn_forward_music;
        public ImageView mln_btn_close;

        public MusicLayoutNotification(Context context,ViewGroup parent) {
            this(context,parent, R.layout.music_layout_notification );
        }

        public MusicLayoutNotification(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            mln_img_picture_music = (ImageView) root.findViewById( R.id.mln_img_picture_music);
            mln_txt_music_name = (TextView) root.findViewById( R.id.mln_txt_music_name);
            mln_txt_music_outher = (TextView) root.findViewById( R.id.mln_txt_music_outher);
            mln_btn_Previous_music = (ImageView) root.findViewById( R.id.mln_btn_Previous_music);
            mln_btn_play_music = (ImageView) root.findViewById( R.id.mln_btn_play_music);
            mln_btn_forward_music = (ImageView) root.findViewById( R.id.mln_btn_forward_music);
            mln_btn_close = (ImageView) root.findViewById( R.id.mln_btn_close);
        }

        public MusicLayoutNotification(Context context) {
            this(context ,null);
        }

        public MusicLayoutNotification(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.music_layout_notification;
            public static int mln_img_picture_music = R.id.mln_img_picture_music;
            public static int mln_txt_music_name = R.id.mln_txt_music_name;
            public static int mln_txt_music_outher = R.id.mln_txt_music_outher;
            public static int mln_btn_Previous_music = R.id.mln_btn_Previous_music;
            public static int mln_btn_play_music = R.id.mln_btn_play_music;
            public static int mln_btn_forward_music = R.id.mln_btn_forward_music;
            public static int mln_btn_close = R.id.mln_btn_close;
        }
    }

    public static class MusicLayoutSmall {
        public LinearLayout root;
        public MaterialDesignTextView mls_btn_play_music;
        public TextView mls_txt_music_name;
        public TextView mls_txt_music_time_counter;
        public TextView mls_txt_music_time;
        public MaterialDesignTextView mls_btn_close;

        public MusicLayoutSmall(Context context,ViewGroup parent) {
            this(context,parent, R.layout.music_layout_small );
        }

        public MusicLayoutSmall(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            mls_btn_play_music = (MaterialDesignTextView) root.findViewById( R.id.mls_btn_play_music);
            mls_txt_music_name = (TextView) root.findViewById( R.id.mls_txt_music_name);
            mls_txt_music_time_counter = (TextView) root.findViewById( R.id.mls_txt_music_time_counter);
            mls_txt_music_time = (TextView) root.findViewById( R.id.mls_txt_music_time);
            mls_btn_close = (MaterialDesignTextView) root.findViewById( R.id.mls_btn_close);
        }

        public MusicLayoutSmall(Context context) {
            this(context ,null);
        }

        public MusicLayoutSmall(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.music_layout_small;
            public static int mls_btn_play_music = R.id.mls_btn_play_music;
            public static int mls_txt_music_name = R.id.mls_txt_music_name;
            public static int mls_txt_music_time_counter = R.id.mls_txt_music_time_counter;
            public static int mls_txt_music_time = R.id.mls_txt_music_time;
            public static int mls_btn_close = R.id.mls_btn_close;
        }
    }

    public static class OptionItem {
        public LinearLayout root;
        public StyleImageView imgFilter;
        public TextView txtName;

        public OptionItem(Context context,ViewGroup parent) {
            this(context,parent, R.layout.option_item );
        }

        public OptionItem(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            imgFilter = (StyleImageView) root.findViewById( R.id.imgFilter);
            txtName = (TextView) root.findViewById( R.id.txtName);
        }

        public OptionItem(Context context) {
            this(context ,null);
        }

        public OptionItem(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.option_item;
            public static int imgFilter = R.id.imgFilter;
            public static int txtName = R.id.txtName;
        }
    }

    public static class PopupFaq {
        public LinearLayout root;
        public MaterialDesignTextView popup_faq_reload;
        public TextView popup_faq_findPage;
        public TextView popup_faq_openChrome;

        public PopupFaq(Context context,ViewGroup parent) {
            this(context,parent, R.layout.popup_faq );
        }

        public PopupFaq(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            popup_faq_reload = (MaterialDesignTextView) root.findViewById( R.id.popup_faq_reload);
            popup_faq_findPage = (TextView) root.findViewById( R.id.popup_faq_findPage);
            popup_faq_openChrome = (TextView) root.findViewById( R.id.popup_faq_openChrome);
        }

        public PopupFaq(Context context) {
            this(context ,null);
        }

        public PopupFaq(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.popup_faq;
            public static int popup_faq_reload = R.id.popup_faq_reload;
            public static int popup_faq_findPage = R.id.popup_faq_findPage;
            public static int popup_faq_openChrome = R.id.popup_faq_openChrome;
        }
    }

    public static class PopupWindow {
        public LinearLayout root;
        public TextView popup_txtItem1;
        public TextView popup_txtItem2;
        public TextView popup_txtItem3;
        public TextView popup_txtItem4;

        public PopupWindow(Context context,ViewGroup parent) {
            this(context,parent, R.layout.popup_window );
        }

        public PopupWindow(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            popup_txtItem1 = (TextView) root.findViewById( R.id.popup_txtItem1);
            popup_txtItem2 = (TextView) root.findViewById( R.id.popup_txtItem2);
            popup_txtItem3 = (TextView) root.findViewById( R.id.popup_txtItem3);
            popup_txtItem4 = (TextView) root.findViewById( R.id.popup_txtItem4);
        }

        public PopupWindow(Context context) {
            this(context ,null);
        }

        public PopupWindow(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.popup_window;
            public static int popup_txtItem1 = R.id.popup_txtItem1;
            public static int popup_txtItem2 = R.id.popup_txtItem2;
            public static int popup_txtItem3 = R.id.popup_txtItem3;
            public static int popup_txtItem4 = R.id.popup_txtItem4;
        }
    }

    public static class RgAdapterDialog {
        public LinearLayout root;
        public RadioButton rg_radioButton;

        public RgAdapterDialog(Context context,ViewGroup parent) {
            this(context,parent, R.layout.rg_adapter_dialog );
        }

        public RgAdapterDialog(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            rg_radioButton = (RadioButton) root.findViewById( R.id.rg_radioButton);
        }

        public RgAdapterDialog(Context context) {
            this(context ,null);
        }

        public RgAdapterDialog(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.rg_adapter_dialog;
            public static int rg_radioButton = R.id.rg_radioButton;
        }
    }

    public static class RgDialog {
        public LinearLayout root;
        public SearchView rg_edtSearch_toolbar;
        public TextView rg_txt_titleToolbar;
        public View rg_borderButton;
        public ListView lstContent;
        public TextView rg_txt_okDialog;

        public RgDialog(Context context,ViewGroup parent) {
            this(context,parent, R.layout.rg_dialog );
        }

        public RgDialog(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            rg_edtSearch_toolbar = (SearchView) root.findViewById( R.id.rg_edtSearch_toolbar);
            rg_txt_titleToolbar = (TextView) root.findViewById( R.id.rg_txt_titleToolbar);
            rg_borderButton = (View) root.findViewById( R.id.rg_borderButton);
            lstContent = (ListView) root.findViewById( R.id.lstContent);
            rg_txt_okDialog = (TextView) root.findViewById( R.id.rg_txt_okDialog);
        }

        public RgDialog(Context context) {
            this(context ,null);
        }

        public RgDialog(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.rg_dialog;
            public static int rg_edtSearch_toolbar = R.id.rg_edtSearch_toolbar;
            public static int rg_txt_titleToolbar = R.id.rg_txt_titleToolbar;
            public static int rg_borderButton = R.id.rg_borderButton;
            public static int lstContent = R.id.lstContent;
            public static int rg_txt_okDialog = R.id.rg_txt_okDialog;
        }
    }

    public static class RgDialogVerifyCode {
        public LinearLayout root;
        public TextView txt_show_reason;
        public MEditText rg_edt_dialog_verifyCode;
        public TextView rg_btn_dialog_okVerifyCode;
        public TextView rg_btn_cancelVerifyCode;

        public RgDialogVerifyCode(Context context,ViewGroup parent) {
            this(context,parent, R.layout.rg_dialog_verify_code );
        }

        public RgDialogVerifyCode(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            txt_show_reason = (TextView) root.findViewById( R.id.txt_show_reason);
            rg_edt_dialog_verifyCode = (MEditText) root.findViewById( R.id.rg_edt_dialog_verifyCode);
            rg_btn_dialog_okVerifyCode = (TextView) root.findViewById( R.id.rg_btn_dialog_okVerifyCode);
            rg_btn_cancelVerifyCode = (TextView) root.findViewById( R.id.rg_btn_cancelVerifyCode);
        }

        public RgDialogVerifyCode(Context context) {
            this(context ,null);
        }

        public RgDialogVerifyCode(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.rg_dialog_verify_code;
            public static int txt_show_reason = R.id.txt_show_reason;
            public static int rg_edt_dialog_verifyCode = R.id.rg_edt_dialog_verifyCode;
            public static int rg_btn_dialog_okVerifyCode = R.id.rg_btn_dialog_okVerifyCode;
            public static int rg_btn_cancelVerifyCode = R.id.rg_btn_cancelVerifyCode;
        }
    }

    public static class RgDialogVerifyLand {
        public LinearLayout root;
        public ProgressBar rg_prg_verify_connect_DialogLand;
        public ImageView rg_img_verify_connect_DialogLand;
        public TextView rg_txt_verify_connect_DialogLand;
        public ProgressBar rg_prg_verify_sms_DialogLand;
        public ImageView rg_img_verify_sms_DialogLand;
        public TextView rg_txt_verify_sms_DialogLand;
        public TextView rg_txt_verify_timer_DialogLand;
        public ProgressBar rg_prg_verify_key_DialogLand;
        public ImageView rg_img_verify_key_DialogLand;
        public TextView rg_txt_verify_key_DialogLand;
        public ProgressBar rg_prg_verify_server_DialogLand;
        public ImageView rg_img_verify_server_DialogLand;
        public TextView rg_txt_verify_server_DialogLand;

        public RgDialogVerifyLand(Context context,ViewGroup parent) {
            this(context,parent, R.layout.rg_dialog_verify_land );
        }

        public RgDialogVerifyLand(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            rg_prg_verify_connect_DialogLand = (ProgressBar) root.findViewById( R.id.rg_prg_verify_connect_DialogLand);
            rg_img_verify_connect_DialogLand = (ImageView) root.findViewById( R.id.rg_img_verify_connect_DialogLand);
            rg_txt_verify_connect_DialogLand = (TextView) root.findViewById( R.id.rg_txt_verify_connect_DialogLand);
            rg_prg_verify_sms_DialogLand = (ProgressBar) root.findViewById( R.id.rg_prg_verify_sms_DialogLand);
            rg_img_verify_sms_DialogLand = (ImageView) root.findViewById( R.id.rg_img_verify_sms_DialogLand);
            rg_txt_verify_sms_DialogLand = (TextView) root.findViewById( R.id.rg_txt_verify_sms_DialogLand);
            rg_txt_verify_timer_DialogLand = (TextView) root.findViewById( R.id.rg_txt_verify_timer_DialogLand);
            rg_prg_verify_key_DialogLand = (ProgressBar) root.findViewById( R.id.rg_prg_verify_key_DialogLand);
            rg_img_verify_key_DialogLand = (ImageView) root.findViewById( R.id.rg_img_verify_key_DialogLand);
            rg_txt_verify_key_DialogLand = (TextView) root.findViewById( R.id.rg_txt_verify_key_DialogLand);
            rg_prg_verify_server_DialogLand = (ProgressBar) root.findViewById( R.id.rg_prg_verify_server_DialogLand);
            rg_img_verify_server_DialogLand = (ImageView) root.findViewById( R.id.rg_img_verify_server_DialogLand);
            rg_txt_verify_server_DialogLand = (TextView) root.findViewById( R.id.rg_txt_verify_server_DialogLand);
        }

        public RgDialogVerifyLand(Context context) {
            this(context ,null);
        }

        public RgDialogVerifyLand(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.rg_dialog_verify_land;
            public static int rg_prg_verify_connect_DialogLand = R.id.rg_prg_verify_connect_DialogLand;
            public static int rg_img_verify_connect_DialogLand = R.id.rg_img_verify_connect_DialogLand;
            public static int rg_txt_verify_connect_DialogLand = R.id.rg_txt_verify_connect_DialogLand;
            public static int rg_prg_verify_sms_DialogLand = R.id.rg_prg_verify_sms_DialogLand;
            public static int rg_img_verify_sms_DialogLand = R.id.rg_img_verify_sms_DialogLand;
            public static int rg_txt_verify_sms_DialogLand = R.id.rg_txt_verify_sms_DialogLand;
            public static int rg_txt_verify_timer_DialogLand = R.id.rg_txt_verify_timer_DialogLand;
            public static int rg_prg_verify_key_DialogLand = R.id.rg_prg_verify_key_DialogLand;
            public static int rg_img_verify_key_DialogLand = R.id.rg_img_verify_key_DialogLand;
            public static int rg_txt_verify_key_DialogLand = R.id.rg_txt_verify_key_DialogLand;
            public static int rg_prg_verify_server_DialogLand = R.id.rg_prg_verify_server_DialogLand;
            public static int rg_img_verify_server_DialogLand = R.id.rg_img_verify_server_DialogLand;
            public static int rg_txt_verify_server_DialogLand = R.id.rg_txt_verify_server_DialogLand;
        }
    }

    public static class RgMdialogText {
        public LinearLayout root;
        public TextView rg_dialog_txt_number;

        public RgMdialogText(Context context,ViewGroup parent) {
            this(context,parent, R.layout.rg_mdialog_text );
        }

        public RgMdialogText(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            rg_dialog_txt_number = (TextView) root.findViewById( R.id.rg_dialog_txt_number);
        }

        public RgMdialogText(Context context) {
            this(context ,null);
        }

        public RgMdialogText(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.rg_mdialog_text;
            public static int rg_dialog_txt_number = R.id.rg_dialog_txt_number;
        }
    }

    public static class SearchFragmentLayout {
        public LinearLayout root;
        public LinearLayout sfl_ll_toolbar;
        public RippleView sfl_ripple_back;
        public MaterialDesignTextView sfl_btn_back;
        public MEditText sfl_edt_search;
        public RippleView sfl_ripple_done;
        public MaterialDesignTextView sfl_btn_close;
        public RecyclerView sfl_recycleview;
        public ImageView sfl_imv_nothing_found;
        public TextView sfl_txt_empty_list_comment;
        public ContentLoadingProgressBar sfl_progress_loading;

        public SearchFragmentLayout(Context context,ViewGroup parent) {
            this(context,parent, R.layout.search_fragment_layout );
        }

        public SearchFragmentLayout(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            sfl_ll_toolbar = (LinearLayout) root.findViewById( R.id.sfl_ll_toolbar);
            sfl_ripple_back = (RippleView) root.findViewById( R.id.sfl_ripple_back);
            sfl_btn_back = (MaterialDesignTextView) root.findViewById( R.id.sfl_btn_back);
            sfl_edt_search = (MEditText) root.findViewById( R.id.sfl_edt_search);
            sfl_ripple_done = (RippleView) root.findViewById( R.id.sfl_ripple_done);
            sfl_btn_close = (MaterialDesignTextView) root.findViewById( R.id.sfl_btn_close);
            sfl_recycleview = (RecyclerView) root.findViewById( R.id.sfl_recycleview);
            sfl_imv_nothing_found = (ImageView) root.findViewById( R.id.sfl_imv_nothing_found);
            sfl_txt_empty_list_comment = (TextView) root.findViewById( R.id.sfl_txt_empty_list_comment);
            sfl_progress_loading = (ContentLoadingProgressBar) root.findViewById( R.id.sfl_progress_loading);
        }

        public SearchFragmentLayout(Context context) {
            this(context ,null);
        }

        public SearchFragmentLayout(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.search_fragment_layout;
            public static int sfl_ll_toolbar = R.id.sfl_ll_toolbar;
            public static int sfl_ripple_back = R.id.sfl_ripple_back;
            public static int sfl_btn_back = R.id.sfl_btn_back;
            public static int sfl_edt_search = R.id.sfl_edt_search;
            public static int sfl_ripple_done = R.id.sfl_ripple_done;
            public static int sfl_btn_close = R.id.sfl_btn_close;
            public static int sfl_recycleview = R.id.sfl_recycleview;
            public static int sfl_imv_nothing_found = R.id.sfl_imv_nothing_found;
            public static int sfl_txt_empty_list_comment = R.id.sfl_txt_empty_list_comment;
            public static int sfl_progress_loading = R.id.sfl_progress_loading;
        }
    }

    public static class SearchFragmentSubLayout {
        public LinearLayout root;
        public CircleImageView sfsl_imv_contact_avatar;
        public TextView sfsl_txt_icon;
        public CustomTextViewMedium sfsl_txt_contact_name;
        public EmojiTextViewE sfsl_txt_contact_lastseen;
        public TextView sfsl_txt_time;

        public SearchFragmentSubLayout(Context context,ViewGroup parent) {
            this(context,parent, R.layout.search_fragment_sub_layout );
        }

        public SearchFragmentSubLayout(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            sfsl_imv_contact_avatar = (CircleImageView) root.findViewById( R.id.sfsl_imv_contact_avatar);
            sfsl_txt_icon = (TextView) root.findViewById( R.id.sfsl_txt_icon);
            sfsl_txt_contact_name = (CustomTextViewMedium) root.findViewById( R.id.sfsl_txt_contact_name);
            sfsl_txt_contact_lastseen = (EmojiTextViewE) root.findViewById( R.id.sfsl_txt_contact_lastseen);
            sfsl_txt_time = (TextView) root.findViewById( R.id.sfsl_txt_time);
        }

        public SearchFragmentSubLayout(Context context) {
            this(context ,null);
        }

        public SearchFragmentSubLayout(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.search_fragment_sub_layout;
            public static int sfsl_imv_contact_avatar = R.id.sfsl_imv_contact_avatar;
            public static int sfsl_txt_icon = R.id.sfsl_txt_icon;
            public static int sfsl_txt_contact_name = R.id.sfsl_txt_contact_name;
            public static int sfsl_txt_contact_lastseen = R.id.sfsl_txt_contact_lastseen;
            public static int sfsl_txt_time = R.id.sfsl_txt_time;
        }
    }

    public static class SearchFragmentSubLayoutHeader {
        public LinearLayout root;
        public TextView sfslh_txt_header_text;

        public SearchFragmentSubLayoutHeader(Context context,ViewGroup parent) {
            this(context,parent, R.layout.search_fragment_sub_layout_header );
        }

        public SearchFragmentSubLayoutHeader(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            sfslh_txt_header_text = (TextView) root.findViewById( R.id.sfslh_txt_header_text);
        }

        public SearchFragmentSubLayoutHeader(Context context) {
            this(context ,null);
        }

        public SearchFragmentSubLayoutHeader(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.search_fragment_sub_layout_header;
            public static int sfslh_txt_header_text = R.id.sfslh_txt_header_text;
        }
    }

    public static class ShareMediaSubLayoutLink {
        public LinearLayout root;
        public FrameLayout smsl_fl_contain_main;
        public TextView smsll_txt_shared_link;
        public MessageProgress progress;

        public ShareMediaSubLayoutLink(Context context,ViewGroup parent) {
            this(context,parent, R.layout.share_media_sub_layout_link );
        }

        public ShareMediaSubLayoutLink(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            smsl_fl_contain_main = (FrameLayout) root.findViewById( R.id.smsl_fl_contain_main);
            smsll_txt_shared_link = (TextView) root.findViewById( R.id.smsll_txt_shared_link);
            progress = (MessageProgress) root.findViewById( R.id.progress);
        }

        public ShareMediaSubLayoutLink(Context context) {
            this(context ,null);
        }

        public ShareMediaSubLayoutLink(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.share_media_sub_layout_link;
            public static int smsl_fl_contain_main = R.id.smsl_fl_contain_main;
            public static int smsll_txt_shared_link = R.id.smsll_txt_shared_link;
            public static int progress = R.id.progress;
        }
    }

    public static class SharedMediaSubLayoutFile {
        public LinearLayout root;
        public FrameLayout smsl_fl_contain_main;
        public ImageView smslf_imv_icon_file;
        public MessageProgress progress;
        public TextView smslf_txt_file_name;
        public TextView smslf_txt_file_info;
        public TextView smslf_txt_file_size;

        public SharedMediaSubLayoutFile(Context context,ViewGroup parent) {
            this(context,parent, R.layout.shared_media_sub_layout_file );
        }

        public SharedMediaSubLayoutFile(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            smsl_fl_contain_main = (FrameLayout) root.findViewById( R.id.smsl_fl_contain_main);
            smslf_imv_icon_file = (ImageView) root.findViewById( R.id.smslf_imv_icon_file);
            progress = (MessageProgress) root.findViewById( R.id.progress);
            smslf_txt_file_name = (TextView) root.findViewById( R.id.smslf_txt_file_name);
            smslf_txt_file_info = (TextView) root.findViewById( R.id.smslf_txt_file_info);
            smslf_txt_file_size = (TextView) root.findViewById( R.id.smslf_txt_file_size);
        }

        public SharedMediaSubLayoutFile(Context context) {
            this(context ,null);
        }

        public SharedMediaSubLayoutFile(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.shared_media_sub_layout_file;
            public static int smsl_fl_contain_main = R.id.smsl_fl_contain_main;
            public static int smslf_imv_icon_file = R.id.smslf_imv_icon_file;
            public static int progress = R.id.progress;
            public static int smslf_txt_file_name = R.id.smslf_txt_file_name;
            public static int smslf_txt_file_info = R.id.smslf_txt_file_info;
            public static int smslf_txt_file_size = R.id.smslf_txt_file_size;
        }
    }

    public static class SharedMediaSubLayoutGif {
        public LinearLayout root;
        public FrameLayout smsl_fl_contain_main;
        public GifImageView smslg_gif_view;
        public MessageProgress progress;

        public SharedMediaSubLayoutGif(Context context,ViewGroup parent) {
            this(context,parent, R.layout.shared_media_sub_layout_gif );
        }

        public SharedMediaSubLayoutGif(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            smsl_fl_contain_main = (FrameLayout) root.findViewById( R.id.smsl_fl_contain_main);
            smslg_gif_view = (GifImageView) root.findViewById( R.id.smslg_gif_view);
            progress = (MessageProgress) root.findViewById( R.id.progress);
        }

        public SharedMediaSubLayoutGif(Context context) {
            this(context ,null);
        }

        public SharedMediaSubLayoutGif(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.shared_media_sub_layout_gif;
            public static int smsl_fl_contain_main = R.id.smsl_fl_contain_main;
            public static int smslg_gif_view = R.id.smslg_gif_view;
            public static int progress = R.id.progress;
        }
    }

    public static class SharedMediaSubLayoutImage {
        public CardView root;
        public FrameLayout smsl_fl_contain_main;
        public ImageView smsl_imv_file_pic;
        public LinearLayout smsl_ll_video;
        public TextView smsl_txt_video_icon;
        public TextView smsl_txt_video_time;
        public TextView smsl_txt_video_size;
        public MessageProgress progress;

        public SharedMediaSubLayoutImage(Context context,ViewGroup parent) {
            this(context,parent, R.layout.shared_media_sub_layout_image );
        }

        public SharedMediaSubLayoutImage(Context context,ViewGroup parent, int layout) {
            root = (CardView) LayoutInflater.from(context).inflate(layout,parent ,false);
            smsl_fl_contain_main = (FrameLayout) root.findViewById( R.id.smsl_fl_contain_main);
            smsl_imv_file_pic = (ImageView) root.findViewById( R.id.smsl_imv_file_pic);
            smsl_ll_video = (LinearLayout) root.findViewById( R.id.smsl_ll_video);
            smsl_txt_video_icon = (TextView) root.findViewById( R.id.smsl_txt_video_icon);
            smsl_txt_video_time = (TextView) root.findViewById( R.id.smsl_txt_video_time);
            smsl_txt_video_size = (TextView) root.findViewById( R.id.smsl_txt_video_size);
            progress = (MessageProgress) root.findViewById( R.id.progress);
        }

        public SharedMediaSubLayoutImage(Context context) {
            this(context ,null);
        }

        public SharedMediaSubLayoutImage(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.shared_media_sub_layout_image;
            public static int smsl_fl_contain_main = R.id.smsl_fl_contain_main;
            public static int smsl_imv_file_pic = R.id.smsl_imv_file_pic;
            public static int smsl_ll_video = R.id.smsl_ll_video;
            public static int smsl_txt_video_icon = R.id.smsl_txt_video_icon;
            public static int smsl_txt_video_time = R.id.smsl_txt_video_time;
            public static int smsl_txt_video_size = R.id.smsl_txt_video_size;
            public static int progress = R.id.progress;
        }
    }

    public static class SharedMediaSubLayoutTime {
        public LinearLayout root;
        public TextView smslt_txt_time;

        public SharedMediaSubLayoutTime(Context context,ViewGroup parent) {
            this(context,parent, R.layout.shared_media_sub_layout_time );
        }

        public SharedMediaSubLayoutTime(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            smslt_txt_time = (TextView) root.findViewById( R.id.smslt_txt_time);
        }

        public SharedMediaSubLayoutTime(Context context) {
            this(context ,null);
        }

        public SharedMediaSubLayoutTime(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.shared_media_sub_layout_time;
            public static int smslt_txt_time = R.id.smslt_txt_time;
        }
    }

    public static class ShowImageSubLayout {
        public LinearLayout root;
        public FrameLayout Layout_showImage;
        public TextureView textureView;
        public TouchImageView sisl_touch_image_view;
        public ImageView imgPlay;
        public MessageProgress progress;

        public ShowImageSubLayout(Context context,ViewGroup parent) {
            this(context,parent, R.layout.show_image_sub_layout );
        }

        public ShowImageSubLayout(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            Layout_showImage = (FrameLayout) root.findViewById( R.id.Layout_showImage);
            textureView = (TextureView) root.findViewById( R.id.textureView);
            sisl_touch_image_view = (TouchImageView) root.findViewById( R.id.sisl_touch_image_view);
            imgPlay = (ImageView) root.findViewById( R.id.imgPlay);
            progress = (MessageProgress) root.findViewById( R.id.progress);
        }

        public ShowImageSubLayout(Context context) {
            this(context ,null);
        }

        public ShowImageSubLayout(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.show_image_sub_layout;
            public static int Layout_showImage = R.id.Layout_showImage;
            public static int textureView = R.id.textureView;
            public static int sisl_touch_image_view = R.id.sisl_touch_image_view;
            public static int imgPlay = R.id.imgPlay;
            public static int progress = R.id.progress;
        }
    }

    public static class SpinnerPassword {
        public TextView root;
        public TextView txtSpinner;

        public SpinnerPassword(Context context,ViewGroup parent) {
            this(context,parent, R.layout.spinner_password );
        }

        public SpinnerPassword(Context context,ViewGroup parent, int layout) {
            root = (TextView) LayoutInflater.from(context).inflate(layout,parent ,false);
            txtSpinner = (TextView) root.findViewById( R.id.txtSpinner);
        }

        public SpinnerPassword(Context context) {
            this(context ,null);
        }

        public SpinnerPassword(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.spinner_password;
            public static int txtSpinner = R.id.txtSpinner;
        }
    }

    public static class StDialogClearCach {
        public LinearLayout root;
        public CheckBox st_checkBox_photo;
        public TextView st_txt_sizeFolder_photo;
        public CheckBox st_checkBox_video_dialogClearCash;
        public TextView st_txt_sizeFolder_video;
        public CheckBox st_checkBox_document_dialogClearCash;
        public TextView st_txt_sizeFolder_document_dialogClearCash;
        public CheckBox st_checkBox_audio_dialogClearCash;
        public TextView st_txt_audio_dialogClearCash;
        public CheckBox st_checkBox_map_dialogClearCash;
        public TextView st_txt_map_dialogClearCash;
        public CheckBox st_checkBox_otherFiles;
        public TextView st_txt_otherFiles;
        public TextView st_total_dialogClearCash;
        public TextView st_txt_totalSize_dialogClearCash;

        public StDialogClearCach(Context context,ViewGroup parent) {
            this(context,parent, R.layout.st_dialog_clear_cach );
        }

        public StDialogClearCach(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            st_checkBox_photo = (CheckBox) root.findViewById( R.id.st_checkBox_photo);
            st_txt_sizeFolder_photo = (TextView) root.findViewById( R.id.st_txt_sizeFolder_photo);
            st_checkBox_video_dialogClearCash = (CheckBox) root.findViewById( R.id.st_checkBox_video_dialogClearCash);
            st_txt_sizeFolder_video = (TextView) root.findViewById( R.id.st_txt_sizeFolder_video);
            st_checkBox_document_dialogClearCash = (CheckBox) root.findViewById( R.id.st_checkBox_document_dialogClearCash);
            st_txt_sizeFolder_document_dialogClearCash = (TextView) root.findViewById( R.id.st_txt_sizeFolder_document_dialogClearCash);
            st_checkBox_audio_dialogClearCash = (CheckBox) root.findViewById( R.id.st_checkBox_audio_dialogClearCash);
            st_txt_audio_dialogClearCash = (TextView) root.findViewById( R.id.st_txt_audio_dialogClearCash);
            st_checkBox_map_dialogClearCash = (CheckBox) root.findViewById( R.id.st_checkBox_map_dialogClearCash);
            st_txt_map_dialogClearCash = (TextView) root.findViewById( R.id.st_txt_map_dialogClearCash);
            st_checkBox_otherFiles = (CheckBox) root.findViewById( R.id.st_checkBox_otherFiles);
            st_txt_otherFiles = (TextView) root.findViewById( R.id.st_txt_otherFiles);
            st_total_dialogClearCash = (TextView) root.findViewById( R.id.st_total_dialogClearCash);
            st_txt_totalSize_dialogClearCash = (TextView) root.findViewById( R.id.st_txt_totalSize_dialogClearCash);
        }

        public StDialogClearCach(Context context) {
            this(context ,null);
        }

        public StDialogClearCach(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.st_dialog_clear_cach;
            public static int st_checkBox_photo = R.id.st_checkBox_photo;
            public static int st_txt_sizeFolder_photo = R.id.st_txt_sizeFolder_photo;
            public static int st_checkBox_video_dialogClearCash = R.id.st_checkBox_video_dialogClearCash;
            public static int st_txt_sizeFolder_video = R.id.st_txt_sizeFolder_video;
            public static int st_checkBox_document_dialogClearCash = R.id.st_checkBox_document_dialogClearCash;
            public static int st_txt_sizeFolder_document_dialogClearCash = R.id.st_txt_sizeFolder_document_dialogClearCash;
            public static int st_checkBox_audio_dialogClearCash = R.id.st_checkBox_audio_dialogClearCash;
            public static int st_txt_audio_dialogClearCash = R.id.st_txt_audio_dialogClearCash;
            public static int st_checkBox_map_dialogClearCash = R.id.st_checkBox_map_dialogClearCash;
            public static int st_txt_map_dialogClearCash = R.id.st_txt_map_dialogClearCash;
            public static int st_checkBox_otherFiles = R.id.st_checkBox_otherFiles;
            public static int st_txt_otherFiles = R.id.st_txt_otherFiles;
            public static int st_total_dialogClearCash = R.id.st_total_dialogClearCash;
            public static int st_txt_totalSize_dialogClearCash = R.id.st_txt_totalSize_dialogClearCash;
        }
    }

    public static class StnsPopupColorpicer {
        public LinearLayout root;
        public ColorPicker picker;
        public SVBar svbar;
        public OpacityBar opacitybar;

        public StnsPopupColorpicer(Context context,ViewGroup parent) {
            this(context,parent, R.layout.stns_popup_colorpicer );
        }

        public StnsPopupColorpicer(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            picker = (ColorPicker) root.findViewById( R.id.picker);
            svbar = (SVBar) root.findViewById( R.id.svbar);
            opacitybar = (OpacityBar) root.findViewById( R.id.opacitybar);
        }

        public StnsPopupColorpicer(Context context) {
            this(context ,null);
        }

        public StnsPopupColorpicer(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.stns_popup_colorpicer;
            public static int picker = R.id.picker;
            public static int svbar = R.id.svbar;
            public static int opacitybar = R.id.opacitybar;
        }
    }

    public static class SubLayoutActivityPopupNotification {
        public LinearLayout root;
        public TextView slapn_txt_message;

        public SubLayoutActivityPopupNotification(Context context,ViewGroup parent) {
            this(context,parent, R.layout.sub_layout_activity_popup_notification );
        }

        public SubLayoutActivityPopupNotification(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            slapn_txt_message = (TextView) root.findViewById( R.id.slapn_txt_message);
        }

        public SubLayoutActivityPopupNotification(Context context) {
            this(context ,null);
        }

        public SubLayoutActivityPopupNotification(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.sub_layout_activity_popup_notification;
            public static int slapn_txt_message = R.id.slapn_txt_message;
        }
    }

    public static class SubLayoutExplorer {
        public LinearLayout root;
        public ImageView sle_sub_imageView1;
        public TextView sle_sub_textView1;

        public SubLayoutExplorer(Context context,ViewGroup parent) {
            this(context,parent, R.layout.sub_layout_explorer );
        }

        public SubLayoutExplorer(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            sle_sub_imageView1 = (ImageView) root.findViewById( R.id.sle_sub_imageView1);
            sle_sub_textView1 = (TextView) root.findViewById( R.id.sle_sub_textView1);
        }

        public SubLayoutExplorer(Context context) {
            this(context ,null);
        }

        public SubLayoutExplorer(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.sub_layout_explorer;
            public static int sle_sub_imageView1 = R.id.sle_sub_imageView1;
            public static int sle_sub_textView1 = R.id.sle_sub_textView1;
        }
    }

    public static class ViewPagerIntroduce1 {
        public PercentRelativeLayout root;

        public ViewPagerIntroduce1(Context context,ViewGroup parent) {
            this(context,parent, R.layout.view_pager_introduce_1 );
        }

        public ViewPagerIntroduce1(Context context,ViewGroup parent, int layout) {
            root = (PercentRelativeLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
        }

        public ViewPagerIntroduce1(Context context) {
            this(context ,null);
        }

        public ViewPagerIntroduce1(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.view_pager_introduce_1;
        }
    }

    public static class WebRtc {
        public LinearLayout root;
        public MEditText edtUserId;
        public Button btnCall;
        public Button btnAnswer;
        public Button btnCancel;
        public Button btnUserId;

        public WebRtc(Context context,ViewGroup parent) {
            this(context,parent, R.layout.web_rtc );
        }

        public WebRtc(Context context,ViewGroup parent, int layout) {
            root = (LinearLayout) LayoutInflater.from(context).inflate(layout,parent ,false);
            edtUserId = (MEditText) root.findViewById( R.id.edtUserId);
            btnCall = (Button) root.findViewById( R.id.btnCall);
            btnAnswer = (Button) root.findViewById( R.id.btnAnswer);
            btnCancel = (Button) root.findViewById( R.id.btnCancel);
            btnUserId = (Button) root.findViewById( R.id.btnUserId);
        }

        public WebRtc(Context context) {
            this(context ,null);
        }

        public WebRtc(ViewGroup parent) {
            this(parent.getContext() ,parent);
        }

        public static class IDS {
            public static int LAYOUT = R.layout.web_rtc;
            public static int edtUserId = R.id.edtUserId;
            public static int btnCall = R.id.btnCall;
            public static int btnAnswer = R.id.btnAnswer;
            public static int btnCancel = R.id.btnCancel;
            public static int btnUserId = R.id.btnUserId;
        }
    }

}

/////////////// manual imports /////////////////
/*
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.NumberPicker;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.TextureView;
import android.widget.ToggleButton;
import android.widget.View;
*/
